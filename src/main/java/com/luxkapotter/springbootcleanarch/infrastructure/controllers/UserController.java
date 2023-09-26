package com.luxkapotter.springbootcleanarch.infrastructure.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.springbootcleanarch.application.usecases.CreateUserInteractor;
import com.luxkapotter.springbootcleanarch.domain.entity.User;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final CreateUserInteractor createUserInteractor;
    private final UserDTOMapper userDTOMapper;

    UserController(CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper) {
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@Valid @RequestBody CreateUserRequest request){
        User userBusinessObj = userDTOMapper.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }

}
