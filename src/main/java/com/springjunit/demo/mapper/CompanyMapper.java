package com.springjunit.demo.mapper;

import com.springjunit.demo.model.entity.Company;
import com.springjunit.demo.model.entity.EmployeeCompany;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.response.CompanyResponse;
import com.springjunit.demo.model.response.EmployeeInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CompanyMapper {
    public CompanyResponse mapDTO(Company company, Map<Integer, Employees> employeesMap,
                                  Map<Integer, List<EmployeeCompany>> integerListMap) {

        List<EmployeeInfo> employeeInfos;
        List<EmployeeCompany> employeeCompanyList = integerListMap.get(company.getId());
        employeeInfos = employeeCompanyList.stream().map(it -> mapEmployeeInfo(it, employeesMap)).collect(Collectors.toList());

        return new CompanyResponse().setEmployeeInfos(employeeInfos)
                .setAddress(company.getAddress())
                .setCode(company.getCode())
                .setName(company.getName())
                .setId(company.getId());
    }

    private EmployeeInfo mapEmployeeInfo(EmployeeCompany it, Map<Integer, Employees> employeesMap) {

        Employees employees = employeesMap.get(it.getEmployeeId());
        return new EmployeeInfo().setCode(employees.getCode())
                .setName(employees.getName())
                .setId(employees.getId())
                .setPositions(employees.getPositions());
    }
}
