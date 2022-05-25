package com.springjunit.demo.mapper;

import com.springjunit.demo.model.bo.EmployeeStatus;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.model.request.UpsertEmployeeRequest;
import com.springjunit.demo.model.response.EmployeeInfo;
import com.springjunit.demo.service.SequenceInternalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.util.List;

@Component
@RequiredArgsConstructor
public class EmployeeMapper {

    private SequenceInternalService service;

    /**
     * map UpsertEmployeeRequest to Employees
     *
     * @param request request
     * @return Employees
     */
    public Employees map(UpsertEmployeeRequest request) {

        return new Employees()
                .setCode(service.generateEmployeeCode())
                .setStatus(EmployeeStatus.ACTIVE)
                .setName(request.getName())
                .setDateOfBirth(request.getDateOfBirth() != null ? request.getDateOfBirth().toInstant().atOffset(ZoneOffset.UTC) : null)
                .setPhone(request.getPhone())
                .setEmail(request.getEmail())
                .setAddress(request.getAddress())
                .setIdentityCardNumber(request.getIdentityCardNumber())
                .setFullAddress(request.getFullAddress());
    }

    /**
     * Map AccountInfoOfCustomer Response from Account ,DriverDetail
     *
     * @param employees        employees
     * @param stationResponses stationResponses
     * @return AccountInfoOfCustomer
     */
    public EmployeeInfo mapResponse(Employees employees) {

        EmployeeInfo employeeInfo = new EmployeeInfo();
        employeeInfo.setId(employees.getId());
        employeeInfo.setPositions(employees.getPositions());
        employeeInfo.setCode(employees.getCode());
        employeeInfo.setName(employees.getName());

        return employeeInfo;
    }
}
