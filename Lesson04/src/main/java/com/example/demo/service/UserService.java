package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        userRepository.save(new User(null, "Valerii", "my@mail.com"));
        userRepository.save(new User(null, "Ivan", "ivan@mail.com"));
        userRepository.save(new User(null, "Fedor", "fedor@mail.com"));
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

}
