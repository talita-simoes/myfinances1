package com.talita.myfinances1.service;

import com.talita.myfinances1.model.entity.User;

//this class/ interface defines the methods to work with the User entity
public interface UserService {
    // to authenticate the user when login
    User authenticate(String email, String password);

    // to register a new user
    User saveUser(User user);

    //to validate the email, checks if the user already has been registered
    void validateEmail(String email);
}
