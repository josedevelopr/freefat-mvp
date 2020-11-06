package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.User;

import java.util.Optional;

public interface UserService
{
    User saveUser(User user);
    Optional<User> findUserById(String id);
}
