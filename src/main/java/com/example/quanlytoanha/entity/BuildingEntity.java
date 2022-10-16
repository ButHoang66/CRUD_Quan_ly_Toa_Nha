package com.example.quanlytoanha.entity;

import com.example.quanlytoanha.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="building")
@Getter
@Setter
public class BuildingEntity extends BaseEntity<Long> {
    @Column(name="name")
    String name ;
    @Column(name="street")
    String street  ;
}
