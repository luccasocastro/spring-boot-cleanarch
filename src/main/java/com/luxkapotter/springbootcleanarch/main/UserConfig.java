package com.luxkapotter.springbootcleanarch.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luxkapotter.springbootcleanarch.application.usecases.CreateUserInteractor;
import com.luxkapotter.springbootcleanarch.application.usecases.gateways.UserGateway;
import com.luxkapotter.springbootcleanarch.infrastructure.controllers.UserDTOMapper;
import com.luxkapotter.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import com.luxkapotter.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import com.luxkapotter.springbootcleanarch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
    
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
