package com.example.quanlytoanha.repository;

import com.example.quanlytoanha.core.BaseRepository;
import com.example.quanlytoanha.entity.BuildingEntity;
import com.example.quanlytoanha.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends BaseRepository<UserEntity,Long> {
}
