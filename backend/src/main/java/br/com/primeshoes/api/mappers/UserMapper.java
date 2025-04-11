package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.UserCreateDTO;
import br.com.primeshoes.api.dtos.UserResponseDTO;
import br.com.primeshoes.api.entities.User;

public class UserMapper {

    public static User toEntity(UserCreateDTO userDTO) {
        User user = new User();
        user.setName(userDTO.name());
        user.setEmail(userDTO.email());
        user.setPassword(userDTO.password());
        return user;
    }

    public static UserResponseDTO toDTO(User user) {
        return new UserResponseDTO(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.isAdmin()
        );
    }
}