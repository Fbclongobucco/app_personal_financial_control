package com.buccodev.app_finance.application.usecases.user_usecases;

import com.buccodev.app_finance.core.entities.User;

public interface CreateUser {

    User saveUser(User user);
    Boolean existisByEmail(String email);
}
