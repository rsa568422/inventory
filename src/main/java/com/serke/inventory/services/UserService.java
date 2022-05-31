package com.serke.inventory.services;

import com.serke.inventory.models.User;

import java.util.Optional;

public interface UserService {

    Optional<User> loginWithUserName(String userName, String password);

    Optional<User> loginWithEmail(String email, String password);

}
