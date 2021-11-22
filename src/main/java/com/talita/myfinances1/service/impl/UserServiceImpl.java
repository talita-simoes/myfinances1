package com.talita.myfinances1.service.impl;

import com.talita.myfinances1.exception.RuleBusinessException;
import com.talita.myfinances1.model.entity.User;
import com.talita.myfinances1.model.repository.UserRepository;
import com.talita.myfinances1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // trans forms this class manageble Bean (dependency injection)
//generates an instance and add a container for when I need to inject in other classes
public class UserServiceImpl implements UserService {

    //As UserService cannot access directly the database, it will need to make the operations
    private UserRepository repository;//dependency

    //constructor to receive the repository
    @Autowired//to inject the repository dependency
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }

    @Override
    public User authenticate(String email, String password) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public void validateEmail(String email) {
       boolean ifExists = repository.existsByEmail(email);
       if(ifExists){
           throw new RuleBusinessException("User already registered with this email");
       }
    }
}
