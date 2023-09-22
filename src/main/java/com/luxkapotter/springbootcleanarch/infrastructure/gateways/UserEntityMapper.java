package com.luxkapotter.springbootcleanarch.infrastructure.gateways;

import com.luxkapotter.springbootcleanarch.domain.entity.User;
import com.luxkapotter.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.email());
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
