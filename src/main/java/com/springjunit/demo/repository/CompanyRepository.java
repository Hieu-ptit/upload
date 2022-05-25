package com.springjunit.demo.repository;

import com.springjunit.demo.model.entity.Company;
import com.springjunit.demo.model.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>, JpaSpecificationExecutor<Company>, InsertUpdateRepository<Company> {
}
