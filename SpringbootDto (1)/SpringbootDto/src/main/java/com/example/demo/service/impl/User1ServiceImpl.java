package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;


import com.example.demo.entity.User1;
import com.example.demo.mapper.User1Mapper;
import com.example.demo.repository.User1Repository;
import com.example.demo.service.User1Service;
import com.example.demo.user1dto.User1Dto;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class User1ServiceImpl implements User1Service {

    private User1Repository user1Repository;

    public User1Dto createUser(User1Dto userDto) {

        // Convert UserDto into User JPA Entity
        User1 user = User1Mapper.mapToUser(userDto);

        User1 savedUser = user1Repository.save(user);

        // Convert User JPA entity to UserDto
        User1Dto savedUserDto = User1Mapper.mapToUserDto(savedUser);

        return savedUserDto;
    }

    @Override
    public User1Dto getUserById(Long userId) {
        Optional<User1> optionalUser = user1Repository.findById(userId);
        User1 user = optionalUser.get();
        return User1Mapper.mapToUserDto(user);
    }

    @Override
    public List<User1Dto> getAllUsers() {
        List<User1> users = user1Repository.findAll();
        return users.stream().map(User1Mapper::mapToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public User1Dto updateUser(User1Dto user) {
        User1 existingUser = user1Repository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User1 updatedUser = user1Repository.save(existingUser);
        return User1Mapper.mapToUserDto(updatedUser);
    }

    @Override
    public void deleteUser(Long userId) {
        user1Repository.deleteById(userId);
    }
}
