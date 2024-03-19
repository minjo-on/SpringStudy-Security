package com.example.springstudysecurity.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue()
    private Long id;
    private String username;
    private String password;
    private String email;
    private String age;
    private String role;
}
