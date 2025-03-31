package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.User;

public record UserResponseDTO(long id, String name, String email, boolean admin) {

    public static UserResponseDTO fromDTO(User user) {
        return new UserResponseDTO(
            user.getId(),
            user.getName(),
            user.getEmail(),
            user.isAdmin()
        );
    }
}