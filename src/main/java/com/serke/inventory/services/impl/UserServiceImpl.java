package com.serke.inventory.services.impl;

import com.serke.inventory.models.User;
import com.serke.inventory.repositories.UserRepository;
import com.serke.inventory.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public Optional<User> loginWithUserName(String userName) {
        return this.userRepository.findByUserName(userName);
    }

    @Override
    public Optional<User> loginWithEmail(String email) {
        return Optional.empty();
    }

}
