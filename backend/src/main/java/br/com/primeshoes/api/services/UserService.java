package br.com.primeshoes.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.dtos.UserResponseDTO;
import br.com.primeshoes.api.entities.User;
import br.com.primeshoes.api.mappers.UserMapper;
import br.com.primeshoes.api.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO store(UserCreateDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return UserMapper.toDTO(user);
    }

    public List<UserResponseDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .toList();
    }
}