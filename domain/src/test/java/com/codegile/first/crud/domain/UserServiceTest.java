package com.codegile.first.crud.domain;

import com.codegile.first.crud.User;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Silviana on 24.03.2016.
 */
public class UserServiceTest {

    UserService userService;

    @Test
    public void userServiceCanRegisterUser() {
        assertNotNull(userService.registerUser(new User()));
    }

}
