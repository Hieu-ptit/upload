package com.springjunit.demo.controller;

import com.springjunit.demo.model.response.CompanyResponse;
import com.springjunit.demo.model.response.Response;
import com.springjunit.demo.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@Validated
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService service;
    @GetMapping("/staff")
    public Response<List<CompanyResponse>> findAllEmployee() {
        return Response.ofSucceeded(service.findAll());
    }

}
