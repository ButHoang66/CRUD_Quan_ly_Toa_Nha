package com.example.quanlytoanha.core;

import java.util.List;

public class BaseServiceImpl<T extends BaseEntity , D extends BaseDTO> implements BaseService<T,D> {
    public BaseRepository baseRepository  ;
    @Override
    public List<T> getAll(){
        return baseRepository.findAll() ;
    }

    @Override
    public List<D> convert(List<T> baseEntity) {
        return  null  ;
    }
    public List<D> getAllDTO(){
        return convert(getAll())  ;
    }

    @Override
    public T postDTO(D  baseDTO) {
        return null ;
    }

    @Override
    public void deleteDTO(Long Id) {
        baseRepository.deleteById(Id);
    }

    public T putDTO(D baseDTO) throws Exception {
        return null ;
    }


}
