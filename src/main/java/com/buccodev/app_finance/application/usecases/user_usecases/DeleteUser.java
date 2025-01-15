package com.buccodev.app_finance.application.usecases.user_usecases;

public interface DeleteUser {

    void deleteUserById(Long id);
    void deleteUserByEmail(String email);
}
