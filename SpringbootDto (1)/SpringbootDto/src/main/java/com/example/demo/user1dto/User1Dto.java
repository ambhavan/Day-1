package com.example.demo.user1dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User1Dto {
	private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
