package com.serke.inventory.repositories;

import com.serke.inventory.models.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findByUserName(String userName);

    Optional<User> findByEmail(String email);

    void update(User user);

}
