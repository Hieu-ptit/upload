package com.springjunit.demo.service.impl;

import com.springjunit.demo.mapper.EmployeeMapper;
import com.springjunit.demo.model.bo.EmployeeStatus;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.request.CreateEmployeeRequest;
import com.springjunit.demo.model.request.FilterEmployeeRequest;
import com.springjunit.demo.model.response.EmployeeInfo;
import com.springjunit.demo.repository.EmployeeRepository;
import com.springjunit.demo.service.EmployeeService;
import com.springjunit.demo.util.Global;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeMapper mapper;
    private final EmployeeRepository repository;

    @Override
    public Employees findByCode(String code) {
        return repository.findByCode(code);
    }

    /**
     * find  employee by filter , sort , searchText ,page
     * <p>
     * param filterEmployeeRequest
     * param searchText
     * param field
     * param direction
     *
     * @return EmployeeInfo
     */
    @Override
    public Page<EmployeeInfo> employeeFilter(FilterEmployeeRequest filterEmployeeRequest, String searchText, String field, Sort.Direction direction) {

        Pageable pageable = PageRequest.of(filterEmployeeRequest.getPage(), filterEmployeeRequest.getSize(), Sort.by(direction, field));

        List<Employees> employees = repository.findAll(getEmployeeFilter(filterEmployeeRequest), Sort.by(direction, field));

        List<EmployeeInfo> employeeInfos = employees.stream().
                map(mapper::mapResponse)
                .collect(Collectors.toList());

        return createPageFromList(employeeInfos, pageable);
    }

    @Override
    public Boolean create(CreateEmployeeRequest request) {
        Employees employee = mapper.map(request);
        repository.insert(employee);
        return true;
    }

    @Override
    public List<Employees> findAll() {
        return  repository.findAll();
    }

    /**
     * create page from list
     * <p>
     * param list
     * param pageable
     * param <T>
     *
     * @return <T> Page<T>
     */
    private <T> Page<T> createPageFromList(List<T> list, Pageable pageable) {
        if (list == null)
            throw new IllegalArgumentException("To create a Page, the list mustn't be null!");

        int startOfPage = pageable.getPageNumber() * pageable.getPageSize();
        if (startOfPage > list.size())
            return new PageImpl<>(new ArrayList<>(), pageable, 0);

        int endOfPage = Math.min(startOfPage + pageable.getPageSize(), list.size());
        return new PageImpl<>(list.subList(startOfPage, endOfPage), pageable, list.size());
    }

    /**
     * filter employee by status ,department,positions
     * <p>
     * param filterEmployeeRequest
     *
     * @return Specification<Employees>
     */
    private Specification<Employees> getEmployeeFilter(FilterEmployeeRequest filterEmployeeRequest) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            predicates.add(criteriaBuilder.equal(root.get("status"), EmployeeStatus.ACTIVE));

            if (filterEmployeeRequest.getDepartment() != null) {
                Predicate predicateDepartment =
                        (criteriaBuilder.function(Global.getFunctionPostgres,
                                String.class, root.get("department"),
                                criteriaBuilder.literal("id").as(String.class))).in(filterEmployeeRequest.getDepartment().toString());
                predicates.add(predicateDepartment);
            }
            if (filterEmployeeRequest.getPositions() != null) {
                Predicate predicatePositions =
                        (criteriaBuilder.function(Global.getFunctionPostgres,
                                String.class, root.get("positions"),
                                criteriaBuilder.literal("id").as(String.class))).in(filterEmployeeRequest.getPositions().toString());
                predicates.add(predicatePositions);
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }


}
