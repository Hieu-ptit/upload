package com.springjunit.demo.model.entity;

import com.springjunit.demo.converter.JsonConverterProperties;
import com.springjunit.demo.model.bo.EmployeeStatus;
import com.springjunit.demo.model.bo.Gender;
import com.springjunit.demo.model.response.PropertiesResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity(name = "employees")
@Table(indexes = {

})
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Employees extends BaseEntity {

    @Id
    @SequenceGenerator(name = "employees_id_seq", sequenceName = "employees_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employees_id_seq")
    Integer id;

    @Column(length = 50)
    String code;

    @Column(columnDefinition = "varchar(99)")
    String name;

    @Column(columnDefinition = "timestamp")
    OffsetDateTime dateOfBirth;

    @Column(columnDefinition = "varchar(20)")
    @Enumerated(EnumType.STRING)
    Gender gender;

    @Column(columnDefinition = "varchar(20)")
    String phone;

    @Column(length = 50, columnDefinition = "text")
    String email;

    @Column(columnDefinition = "jsonb")
    @Convert(converter = JsonConverterProperties.class)
    PropertiesResponse positions;

    @Column
    String accountId;

    @Column(length = 100)
    String address;

    @Column
    String identityCardNumber;

    @Column(columnDefinition = "varchar(100)")
    String fullAddress;

    @Column(columnDefinition = "varchar(20) default 'ACTIVE'")
    @Enumerated(EnumType.STRING)
    EmployeeStatus status;
}
