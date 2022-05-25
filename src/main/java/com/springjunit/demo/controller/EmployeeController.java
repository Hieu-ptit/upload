package com.springjunit.demo.controller;
import com.springjunit.demo.exception.BusinessException;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.request.CreateEmployeeRequest;
import com.springjunit.demo.model.request.FilterEmployeeRequest;
import com.springjunit.demo.model.response.Response;
import com.springjunit.demo.repository.EmployeeRepository;
import com.springjunit.demo.service.EmployeeService;
import com.springjunit.demo.util.ErrorCode;
import com.springjunit.demo.util.Global;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RequiredArgsConstructor
@RestController
@Validated
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService service;
    private final EmployeeRepository repository;

    @GetMapping
    public Response<?> EmployeeFilter(
            @Length(max = 99, message = "4158")
            @RequestParam(value = "search-text", required = false) String searchText,
            @RequestParam(value = "department-id", required = false) Integer departmentId,
            @RequestParam(value = "positions-id", required = false) Integer positionsId,
            @RequestParam(value = "direction-sort", defaultValue = "DESC") Sort.Direction direction,
            @RequestParam(value = "field-sort", defaultValue = "createdAt") String field,
            @Min(value = 1, message = "4156")
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @Min(value = 0, message = "4157")
            @RequestParam(value = "size", defaultValue = "100") Integer size) {
        if (!StringUtils.isEmpty(field) && !Global.fieldSortEmployee.contains(field))
            throw new BusinessException(ErrorCode.FIELD_SORT_INVALID, "Field sort: " + field + " invalid !");
        FilterEmployeeRequest filterEmployee = new FilterEmployeeRequest();
        filterEmployee.setDepartment(departmentId);
        filterEmployee.setPositions(positionsId);
        filterEmployee.setPage(page - 1);
        filterEmployee.setSize(size);

        return Response.ofSucceeded(service.employeeFilter(filterEmployee, searchText, field, direction));
    }

    @PostMapping
    public Response<Boolean> create(@Valid @RequestBody CreateEmployeeRequest request) {
        return Response.ofSucceeded(service.create(request));
    }

    @GetMapping("/company")
    public List<Employees> getAll(){
        return repository.findAll();

    }
}
