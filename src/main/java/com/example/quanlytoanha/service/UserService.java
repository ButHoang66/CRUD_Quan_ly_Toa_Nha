package com.example.quanlytoanha.service;

import com.example.quanlytoanha.core.BaseServiceImpl;
import com.example.quanlytoanha.dto.UserDTO;
import com.example.quanlytoanha.entity.UserEntity;
import com.example.quanlytoanha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService extends BaseServiceImpl<UserEntity, UserDTO> {
    @Autowired
    public UserService(UserRepository userRepository) {
        this.baseRepository = userRepository;
    }

    @Override
    public List<UserDTO> convert(List<UserEntity> userEntities){
        List<UserDTO> userDTOS = new ArrayList<>();
        for (UserEntity item: userEntities){
            UserDTO userDTO = new UserDTO();
            userDTO.setId(item.getId());
            userDTO.setFullname(item.getFullname());
            userDTO.setPhone(item.getPhone());
            userDTOS.add(userDTO);
        }
        return userDTOS ;
    }

    @Override
    public UserEntity postDTO(UserDTO  userDTO) {
        UserEntity userEntity  = new UserEntity()  ;
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setFullname(userDTO.getFullname());
        return (UserEntity) baseRepository.save(userEntity);
    }
//
//    @Override
//    @Transactional
//    public void deleteDTO(Long id) {
//        baseRepository.deleteById(id);
//    }
    @Override
    public UserEntity putDTO(UserDTO  userDTO) throws Exception {
        UserEntity userEntity  = (UserEntity) baseRepository.getOne(userDTO.getId());
        if(userEntity != null){
            userEntity.setFullname(userDTO.getFullname());
            userEntity.setPhone(userDTO.getPhone());
            return (UserEntity) baseRepository.save(userEntity);
        }  else {
            throw new Exception("not found") ;
        }
    }
}
