package com.example.springstudysecurity.repository;

import com.example.springstudysecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {

    boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}
