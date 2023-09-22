package com.luxkapotter.springbootcleanarch.application.usecases.gateways;

import com.luxkapotter.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
