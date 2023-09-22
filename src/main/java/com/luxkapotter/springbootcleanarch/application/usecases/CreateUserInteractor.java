package com.luxkapotter.springbootcleanarch.application.usecases;

import com.luxkapotter.springbootcleanarch.application.usecases.gateways.UserGateway;
import com.luxkapotter.springbootcleanarch.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;
    
    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
