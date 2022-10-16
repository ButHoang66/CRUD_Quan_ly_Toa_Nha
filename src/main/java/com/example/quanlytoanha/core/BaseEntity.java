package com.example.quanlytoanha.core;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class BaseEntity<ID extends Serializable> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id  ;
}
