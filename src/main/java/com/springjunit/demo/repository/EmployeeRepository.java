package com.springjunit.demo.repository;

import com.springjunit.demo.model.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer>, JpaSpecificationExecutor<Employees>, InsertUpdateRepository<Employees> {

    Employees findByCode(String code);
}
