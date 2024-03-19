package com.example.springstudysecurity.service;

import com.example.springstudysecurity.entity.Account;
import lombok.RequiredArgsConstructor;

public interface UserService {
    void createUser(Account account);

}
