package com.example.demo.mapper;

import com.example.demo.entity.User1;
import com.example.demo.user1dto.User1Dto;

public class User1Mapper {
	// Convert User JPA Entity into UserDto
    public static User1Dto mapToUserDto(User1 user){
        User1Dto userDto = new User1Dto(
                 user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail()
        );
        return userDto;
    }

    // Convert UserDto into User JPA Entity
    public static User1 mapToUser(User1Dto userDto){
        User1 user = new User1(
                userDto.getId(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getEmail()
        );
        return user;
    }

}
