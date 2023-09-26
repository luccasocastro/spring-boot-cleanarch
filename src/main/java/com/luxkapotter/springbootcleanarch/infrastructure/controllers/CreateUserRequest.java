package com.luxkapotter.springbootcleanarch.infrastructure.controllers;

import jakarta.validation.constraints.NotBlank;

public record CreateUserRequest(
    @NotBlank String username, 
    @NotBlank String password, 
    @NotBlank String email) {
    
}
