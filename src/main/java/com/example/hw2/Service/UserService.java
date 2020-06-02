package com.example.hw2.Service;

import com.example.hw2.Repository.UserRepository;
import com.example.hw2.model.USER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public USER getUser() {
        return userRepository.getUser();
    }
}
