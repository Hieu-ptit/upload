package com.springjunit.demo.service;

import com.springjunit.demo.model.response.CompanyResponse;

import java.util.List;

public interface CompanyService {

    List<CompanyResponse> findAll();
}
