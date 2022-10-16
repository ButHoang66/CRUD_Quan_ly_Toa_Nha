package com.example.quanlytoanha.api;

import com.example.quanlytoanha.core.BaseAPI;
import com.example.quanlytoanha.dto.BuildingDTO;
import com.example.quanlytoanha.entity.BuildingEntity;
import com.example.quanlytoanha.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping(value="/api/building")
public class BuildingAPI  extends BaseAPI<BuildingEntity,BuildingDTO> {
    @Autowired
    public  BuildingAPI(BuildingService buildingService){
        this.baseService = buildingService ;
    }
//    @Autowired
//    private IBuildingService buildingService;

    @GetMapping
    List<BuildingDTO> getBuilding() {
        return readAllDTO()  ;
    }

    @PostMapping
    BuildingEntity postBuilding(@RequestBody BuildingDTO  buildingDTO){
        return postDTOApi(buildingDTO);
    }

    @DeleteMapping
    void deleteBuilding(@RequestParam Long id){
        deleteDTOApi(id);
    }

    @PutMapping
    BuildingEntity putBuilding(@RequestBody BuildingDTO buildingDTO) throws Exception {
        return putDTOApi(buildingDTO);
    }

//    @PostMapping
//    Long postBuilding(@RequestBody BuildingDTO buildingDTO){
//        return buildingService.postBuilding(buildingDTO);
//    }
//    @DeleteMapping
//    void deleteBuilding(@RequestBody Long id){
//         buildingService.deleteBuilding(id);
//    }
//    @PutMapping
//    void putBuilding(@RequestBody  BuildingDTO  buildingDTO){
//         buildingService.putBuilding(buildingDTO);
//    }

}
