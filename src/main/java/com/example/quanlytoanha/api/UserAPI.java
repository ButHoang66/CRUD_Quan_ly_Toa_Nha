package com.example.quanlytoanha.api;


import com.example.quanlytoanha.core.BaseAPI;
import com.example.quanlytoanha.dto.BuildingDTO;
import com.example.quanlytoanha.dto.UserDTO;
import com.example.quanlytoanha.entity.BuildingEntity;
import com.example.quanlytoanha.entity.UserEntity;
import com.example.quanlytoanha.repository.UserRepository;
import com.example.quanlytoanha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserAPI extends BaseAPI<UserEntity, UserDTO> {
    @Autowired
    public UserAPI(UserService userService) {
        this.baseService = userService;
    }

    @GetMapping
    List<UserDTO> getUser() {
        return readAllDTO();
    }

    @PostMapping
    UserEntity postUser(@RequestBody UserDTO userDTO) {
        return postDTOApi(userDTO);
    }

    @DeleteMapping
    void  deleteUser(@RequestParam Long id){
        deleteDTOApi(id);
    }

    @PutMapping
    UserEntity putBuilding(@RequestBody UserDTO userDTO) throws Exception {
        return putDTOApi(userDTO);
    }

}