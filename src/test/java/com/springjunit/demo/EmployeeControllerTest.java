package com.springjunit.demo;

import com.springjunit.demo.controller.EmployeeController;
import com.springjunit.demo.model.entity.Employees;
import com.springjunit.demo.repository.EmployeeRepository;
import com.springjunit.demo.service.EmployeeService;
import com.springjunit.demo.service.impl.EmployeeServiceImpl;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

    @Mock
    EmployeeService employeeService;

    @InjectMocks
    EmployeeServiceImpl service;

    @InjectMocks
    EmployeeController controller;
//    Employees alex1 = new Employees().setName("hieu").setCode("1000").setId(1);
//    Employees alex2 = new Employees().setName("son").setCode("1001").setId(2);
//    Employees alex3 = new Employees().setName("duc").setCode("1002").setId(3);
    private MockMvc mockMvc;
    @Mock
    private EmployeeRepository employeeRepository;

    @Before("")
    public void setUp() {

        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void whenValidName_thenEmployeeShouldBeFound() {

        Employees alex1 = new Employees().setName("hieu").setCode("1000").setId(1);
        Employees alex2 = new Employees().setName("son").setCode("1001").setId(2);
        Employees alex3 = new Employees().setName("duc").setCode("1002").setId(3);
        Employees alex4 = new Employees().setName("duc").setCode("1002").setId(4);

//        List<Employees> employeesList2 = new ArrayList<>(Arrays.asList(alex1, alex4));
        List<Employees> employeesList = new ArrayList<>(Arrays.asList(alex2, alex3));
        when(employeeService.findAll()).thenReturn(employeesList);
//        when(employeeRepository.findAll()).thenReturn(employeesList2);
        List<Employees> employees = employeeRepository.findAll();
//        List<Employees> employees1 = employeeRepository.findAll();
        assertEquals(3, employees.size());

        assertEquals(42, Integer.sum(19, 23));
    }
}
