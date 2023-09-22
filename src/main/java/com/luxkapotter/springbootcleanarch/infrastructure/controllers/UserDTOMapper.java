package com.luxkapotter.springbootcleanarch.infrastructure.controllers;

import com.luxkapotter.springbootcleanarch.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.username(), user.email());
    }

    public User toUser(CreateUserRequest request){
        return new User(request.username(), request.password(), request.email());
    }
}
