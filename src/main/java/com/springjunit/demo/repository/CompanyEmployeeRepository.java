package com.springjunit.demo.repository;

import com.springjunit.demo.model.entity.EmployeeCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyEmployeeRepository extends JpaRepository<EmployeeCompany, Integer>, JpaSpecificationExecutor<EmployeeCompany>, InsertUpdateRepository<EmployeeCompany> {


}
