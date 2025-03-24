package br.com.primeshoes.api.repository;

import br.com.primeshoes.api.entites.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User save(User user) {
        return user;
    }

    public List<User> findAll() {
        return List.of();
    }
}
