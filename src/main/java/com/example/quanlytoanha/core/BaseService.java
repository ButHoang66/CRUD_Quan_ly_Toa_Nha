package com.example.quanlytoanha.core;

import java.util.List;

public interface BaseService<T extends BaseEntity , D extends BaseDTO> {
    public List<T> getAll() ;
    public List<D> convert(List<T> baseEntity) ;
    public List<D> getAllDTO() ;
    public T postDTO(D baseDTO) ;
    public void deleteDTO(Long Id);
    public T putDTO(D baseDTO) throws Exception;
}

