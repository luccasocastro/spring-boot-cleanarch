package com.luxkapotter.springbootcleanarch.services;

import org.springframework.stereotype.Service;

import com.luxkapotter.springbootcleanarch.models.User;
import com.luxkapotter.springbootcleanarch.repositories.UserRepository;

@Service
public class UserService {
    
    private UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User create(User user){
        return repository.save(user);
    }
}
