package com.springjunit.demo.service;

import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.request.CreateEmployeeRequest;
import com.springjunit.demo.model.request.FilterEmployeeRequest;
import com.springjunit.demo.model.response.EmployeeInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface EmployeeService {

    Employees findByCode(String code);

    Page<EmployeeInfo> employeeFilter(FilterEmployeeRequest filterEmployeeRequest, String searchText, String field, Sort.Direction direction);

    Boolean create(CreateEmployeeRequest request);

    List<Employees> findAll();
}
