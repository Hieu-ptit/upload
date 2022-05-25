package com.springjunit.demo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity(name = "employee_company")
@Table(indexes = {
//
})
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class EmployeeCompany extends BaseEntity {

    @Id
    @SequenceGenerator(name = "employee_company_id_seq", sequenceName = "employee_company_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_company_id_seq")
    Integer id;

    @Column(columnDefinition = "int default 0")
    Integer companyId;

    @Column(columnDefinition = "int default 0")
    Integer employeeId;

}
