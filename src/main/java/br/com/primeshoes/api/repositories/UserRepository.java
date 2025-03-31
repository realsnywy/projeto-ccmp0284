package br.com.primeshoes.api.repositories;

import br.com.primeshoes.api.entities.User;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

    User save(User user);

    List<User> findAll();
}