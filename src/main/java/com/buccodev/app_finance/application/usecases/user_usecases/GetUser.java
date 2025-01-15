package com.buccodev.app_finance.application.usecases.user_usecases;

import com.buccodev.app_finance.core.entities.User;

import java.util.List;

public interface GetUser {

    List<User> getAllUser();
    User getUserById(Long id);
    User getUserByEmail(String email);
}
