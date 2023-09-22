package com.luxkapotter.springbootcleanarch.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luxkapotter.springbootcleanarch.models.User;
import com.luxkapotter.springbootcleanarch.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService service;

    UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    User create(@RequestBody User user){
        return service.create(user);
    }

}
