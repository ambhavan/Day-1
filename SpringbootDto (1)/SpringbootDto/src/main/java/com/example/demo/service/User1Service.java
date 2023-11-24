package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User1;
import com.example.demo.user1dto.User1Dto;



public interface User1Service {
	User1Dto createUser(User1Dto user);

    User1Dto getUserById(Long userId);

    List<User1Dto> getAllUsers();

    User1Dto updateUser(User1Dto user);

    void deleteUser(Long userId);

}
