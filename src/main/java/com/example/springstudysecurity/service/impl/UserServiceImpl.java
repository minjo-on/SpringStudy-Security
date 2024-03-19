package com.example.springstudysecurity.service.impl;

import com.example.springstudysecurity.entity.Account;
import com.example.springstudysecurity.repository.UserRepository;
import com.example.springstudysecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Transactional
    @Override
    public void createUser(Account account) {
        userRepository.save(account);
    }
}
