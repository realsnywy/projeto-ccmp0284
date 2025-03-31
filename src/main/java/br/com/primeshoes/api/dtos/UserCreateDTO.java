package br.com.primeshoes.api.dtos;

import br.com.primeshoes.api.entities.User;

public record UserCreateDTO(String name, String email, String password) {
    public String toString() {
        return "UserCreateDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public User toDTO() {
        User user = new User();
        user.setName(this.name());
        user.setEmail(this.email());
        user.setPassword(this.password());
        return user;
    }
}