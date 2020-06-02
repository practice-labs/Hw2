package com.example.hw2.Repository;

import com.example.hw2.model.USER;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public USER getUser() {
        USER user = new USER(1, "av", "MA", "www");
        return user;
    }
}
