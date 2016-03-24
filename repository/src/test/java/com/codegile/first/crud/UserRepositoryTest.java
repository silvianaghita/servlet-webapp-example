package com.codegile.first.crud;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Silviana on 24.03.2016.
 */
public class UserRepositoryTest {

    private final UserRepository userRepository = new InMemoryUserRepository();

    @Test
    public void userRepositoryCanCreateNewUser() {
        User expectedUser = new User();
        User createdUser = userRepository.createUser(expectedUser);

        assertEquals(expectedUser, createdUser);
    }


}
