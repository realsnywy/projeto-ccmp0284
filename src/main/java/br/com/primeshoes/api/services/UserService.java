package br.com.primeshoes.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.dtos.UserResponseDTO;
import br.com.primeshoes.api.entites.User;
import br.com.primeshoes.api.mappers.UserMapper;
import br.com.primeshoes.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    public UserResponseDTO store(UserCreateDTO userCreateDTO) {
        User user = userMapper.toEntity(userCreateDTO);
        user = userRepository.save(user);
        UserResponseDTO userReponse = userMapper.toDTO(user);
        return userReponse;
    }

    public List<UserResponseDTO> findAll() {
        return userRepository.findAll().stream().map(userMapper::toDTO).toList();
    }
}
