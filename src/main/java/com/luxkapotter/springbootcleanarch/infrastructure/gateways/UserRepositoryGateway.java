package com.luxkapotter.springbootcleanarch.infrastructure.gateways;

import com.luxkapotter.springbootcleanarch.application.usecases.gateways.UserGateway;
import com.luxkapotter.springbootcleanarch.domain.entity.User;
import com.luxkapotter.springbootcleanarch.infrastructure.persistence.UserEntity;
import com.luxkapotter.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway{
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObj) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
        UserEntity savedObj = userRepository.save(userEntity);
        return userEntityMapper.toDomainObj(savedObj);
    }
    
}
