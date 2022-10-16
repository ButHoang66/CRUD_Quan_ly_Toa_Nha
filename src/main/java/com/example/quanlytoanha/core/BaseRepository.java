package com.example.quanlytoanha.core;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface  BaseRepository <T extends BaseEntity , ID extends Serializable> extends JpaRepository<T,ID>{
}
