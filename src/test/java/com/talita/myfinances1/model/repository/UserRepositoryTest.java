package com.talita.myfinances1.model.repository;

import com.talita.myfinances1.model.entity.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//INTEGRATION TEST
@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")//Indicates the profile to be used for testing (application-test.properties)
public class UserRepositoryTest {

    //declare the class to be tested
    @Autowired // Springboot injects the instance of this class
    UserRepository repository;

    @Test
    public void verifyIfEmailExists(){
        //CONTEXT
        //Create a user to be tested (create a variable type User)
        User user = User.builder().name("usertest1").email("usertest1@email.com").build();
        repository.save(user);

        //ACTION
        //Verify if the user exists with this email *should return true
       boolean result = repository.existsByEmail("usertest1@email.com");

       //VERIFICATION
        Assertions.assertTrue(result);

    }

}
