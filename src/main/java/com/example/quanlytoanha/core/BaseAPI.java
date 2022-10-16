package com.example.quanlytoanha.core;

import com.example.quanlytoanha.entity.BuildingEntity;

import java.util.List;

public abstract class BaseAPI<T extends BaseEntity , D extends BaseDTO> {

    public BaseService baseService ;
//    public List<T> read() {
//        return baseService.getAll();
//    }
    public List<D> readAllDTO(){
        return baseService.getAllDTO() ;
    }
    public T postDTOApi(D baseDTo){
        return (T) baseService.postDTO(baseDTo);
    }

    public void deleteDTOApi(Long id){
        baseService.deleteDTO(id);
    }

    public T putDTOApi(D baseDTO) throws Exception {
        return (T) baseService.putDTO(baseDTO);

    }
}
