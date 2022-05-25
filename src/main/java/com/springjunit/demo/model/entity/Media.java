package com.springjunit.demo.model.entity;

import com.springjunit.demo.model.bo.TypeMedia;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity(name = "medias")
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Media extends BaseEntity {

    @Id
    @SequenceGenerator(name = "medias_id_seq", sequenceName = "medias_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "medias_id_seq")
    Integer id;

    @Column(length = 200, nullable = false)
    String name;

    @Column(columnDefinition = "text")
    String url;

    @Column(length = 64)
    String owner;

    @Column(columnDefinition = "varchar(20) default 'IMAGE'")
    @Enumerated(EnumType.STRING)
    TypeMedia typeMedia;

    public static Media build() {
        return new Media();
    }
}
