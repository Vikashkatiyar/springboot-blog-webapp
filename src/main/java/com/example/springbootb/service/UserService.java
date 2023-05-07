package com.example.springbootb.service;

import com.example.springbootb.dto.RegistrationDto;
import com.example.springbootb.entity.User;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);

    User findByEmail(String email);
}
