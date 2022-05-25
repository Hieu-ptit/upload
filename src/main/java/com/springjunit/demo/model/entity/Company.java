package com.springjunit.demo.model.entity;

import com.springjunit.demo.model.bo.StatusCommon;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity(name = "company")
@Table(indexes = {
        @Index(name = "idx_company", columnList = "status"),
})
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
//@Audited
public class Company extends BaseEntity {

    @Id
    @SequenceGenerator(name = "stations_id_seq", sequenceName = "stations_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stations_id_seq")
    Integer id;

    @Column(length = 100, nullable = false)
    String code;

    @Column(length = 100, nullable = false)
    String name;

    @Column(length = 100)
    String address;

    @Column(columnDefinition = "varchar(20) default 'ACTIVE'", nullable = false)
    @Enumerated(EnumType.STRING)
    StatusCommon status;

    @Column(columnDefinition = "varchar(100)")
    String fullAddress;

    @Column
    String phone;

    @Column(columnDefinition = "boolean default 'false'")
    Boolean corporation;

    public static Company build() {
        return new Company();
    }

}
