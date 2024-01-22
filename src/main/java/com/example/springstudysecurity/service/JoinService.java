package com.example.springstudysecurity.service;

import com.example.springstudysecurity.dto.JoinDTO;
import com.example.springstudysecurity.entity.UserEntity;
import com.example.springstudysecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    private UserRepository repository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public JoinService(UserRepository repository, BCryptPasswordEncoder bCryptPasswordEncoder){
        this.repository = repository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void joinProcess(JoinDTO joinDTO){

        boolean isUser = repository.existsByUsername(joinDTO.getUsername());
        if(isUser){
            return;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setUsername(joinDTO.getUsername());
        userEntity.setPassword(bCryptPasswordEncoder.encode(joinDTO.getPassword()));
        userEntity.setRole("ROLE_ADMIN");

        repository.save(userEntity);
    }
}
