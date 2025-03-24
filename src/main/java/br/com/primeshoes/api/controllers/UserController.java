package br.com.primeshoes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.primeshoes.api.services.UserService;
import br.com.primeshoes.api.dtos.UserResponseDTO;
import br.com.primeshoes.api.dtos.UserCreateDTO;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public UserResponseDTO store(UserCreateDTO userDTO) {
        UserResponseDTO user = userService.store(userDTO);
        return user;
    }

    @GetMapping
    public List<UserResponseDTO> findAll() {
        List<UserResponseDTO> users = userService.findAll();
        return users;
    }

}