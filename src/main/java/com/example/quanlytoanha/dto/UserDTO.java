package com.example.quanlytoanha.dto;

import com.example.quanlytoanha.core.BaseDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO extends BaseDTO {
    private Long id ;
    private String fullname;
    private String phone ;
}
