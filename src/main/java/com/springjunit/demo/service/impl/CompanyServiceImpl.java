package com.springjunit.demo.service.impl;

import com.springjunit.demo.mapper.CompanyMapper;
import com.springjunit.demo.model.entity.Company;
import com.springjunit.demo.model.entity.EmployeeCompany;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.response.CompanyResponse;
import com.springjunit.demo.repository.CompanyEmployeeRepository;
import com.springjunit.demo.repository.CompanyRepository;
import com.springjunit.demo.repository.EmployeeRepository;
import com.springjunit.demo.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository repository;
    private final EmployeeRepository employeeRepository;
    private final CompanyEmployeeRepository companyEmployeeRepository;
    private final CompanyMapper mapper;

    @Override
    public List<CompanyResponse> findAll() {

        List<Employees> employeesList = employeeRepository.findAll();

        List<Company> companyList = repository.findAll();

        Map<Integer, Employees> employeesMap = employeesList.stream().collect(Collectors.toMap(Employees::getId, Function.identity()));

        List<EmployeeCompany> employeeCompanies = companyEmployeeRepository.findAll();

        Map<Integer, List<EmployeeCompany>> integerListMap = employeeCompanies.stream().collect(groupingBy(EmployeeCompany::getCompanyId));

        return companyList.stream().map(it -> mapper.mapDTO(it, employeesMap, integerListMap)).collect(Collectors.toList());
    }
}
