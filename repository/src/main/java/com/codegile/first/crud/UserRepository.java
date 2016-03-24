package com.codegile.first.crud;

/**
 * Created by Silviana on 24.03.2016.
 */
public interface UserRepository {

    User createUser(final User user);

    Boolean deleteUser(final User user);

    User updateUser(final User user);

    User findUserByUsername(final String username);

}
