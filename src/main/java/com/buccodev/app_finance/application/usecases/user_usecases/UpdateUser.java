package com.buccodev.app_finance.application.usecases.user_usecases;

import com.buccodev.app_finance.core.entities.User;

public interface UpdateUser {

    void updateUser(Long id, User user);
    User findUserById(long id);
    void recoveryPassword(Long id, String password);
}
