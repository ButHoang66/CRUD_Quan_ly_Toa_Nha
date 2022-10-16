package com.example.quanlytoanha.entity;

import com.example.quanlytoanha.core.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
public class UserEntity extends BaseEntity<Long> {
    @Column(name="fullname")
    String fullname;
    @Column(name="phone")
    String phone ;
}
