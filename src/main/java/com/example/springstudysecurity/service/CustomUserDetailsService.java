//package com.example.springstudysecurity.service;
//
//import com.example.springstudysecurity.dto.CustomUserDetails;
//import com.example.springstudysecurity.entity.UserEntity;
//import com.example.springstudysecurity.repository.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService {
//    private UserRepository userRepository;
//    public CustomUserDetailsService(UserRepository userRepository){
//        this.userRepository=userRepository;
//    }
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserEntity userEntity;
//        userEntity = userRepository.findByUsername(username);
//
//        if(userEntity != null){
//            return new CustomUserDetails(userEntity);
//        }
//        return null;
//    }
//}
