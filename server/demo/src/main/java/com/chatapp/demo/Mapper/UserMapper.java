package com.chatapp.demo.Mapper;

import com.chatapp.demo.Model.UserInput;
import com.chatapp.demo.Entity.User;

public class UserMapper {
    public static User inputToEntity(UserInput userInput) {
        return User.builder()
                .username(userInput.getUsername())
                .password(userInput.getPassword())
                .build();
    }
}
