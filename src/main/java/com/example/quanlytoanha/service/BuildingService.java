package com.example.quanlytoanha.service;

import com.example.quanlytoanha.core.BaseService;
import com.example.quanlytoanha.core.BaseServiceImpl;
import com.example.quanlytoanha.dto.BuildingDTO;
import com.example.quanlytoanha.entity.BuildingEntity;
import com.example.quanlytoanha.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingService extends BaseServiceImpl<BuildingEntity,BuildingDTO> {
    @Autowired
    public BuildingService(BuildingRepository buildingRepository){
        this.baseRepository  = buildingRepository ;
    }
    @Override
//  private BuildingRepository buildingRepository ;
    public List<BuildingDTO> convert(List<BuildingEntity> buildingEntities){
//      List<BuildingEntity>  buildingEntities = buildingRepository.findAll(Sort.by(Sort.Direction.ASC,"name")) ;
        List<BuildingDTO> buildingDTOs = new ArrayList<>();
        for (BuildingEntity item: buildingEntities){
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setId(item.getId());
            buildingDTO.setName(item.getName());
            buildingDTO.setStreet(item.getStreet());
            buildingDTOs.add(buildingDTO);
        }
        return buildingDTOs ;
    }

    @Override
    public BuildingEntity postDTO(BuildingDTO  buildingDTO) {
        BuildingEntity buildingEntity  = new BuildingEntity()  ;
        buildingEntity.setName(buildingDTO.getName());
        buildingEntity.setStreet(buildingDTO.getStreet());
        return (BuildingEntity) baseRepository.save(buildingEntity);
    }

//    @Override
//    @Transactional
//    public void deleteDTO(Long id) {
//        baseRepository.deleteById(id);
//    }

    @Override
    public BuildingEntity putDTO(BuildingDTO  buildingDTO) throws Exception {
        BuildingEntity buildingEntity  = (BuildingEntity) baseRepository.getOne(buildingDTO.getId());
        if(buildingEntity != null){
            buildingEntity.setName(buildingDTO.getName());
            buildingEntity.setStreet(buildingDTO.getStreet());
            return (BuildingEntity) baseRepository.save(buildingEntity);
        }  else {
            throw new Exception("not found") ;
        }
    }

}
