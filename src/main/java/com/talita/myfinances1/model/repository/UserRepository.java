package com.talita.myfinances1.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.talita.myfinances1.model.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    //query methods on spring data (to avoid the use of the sql here)
    //Optional<User> findByEmail(String email);

    //this replaces 'select * from user where exists()'
    boolean existsByEmail(String email);
}
