package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.User;
import com.freefat.mvp.freefatmvp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepository repository;

    @Override
    public User saveUser(User user)
    {
        return repository.save(user);
    }

    @Override
    public Optional<User> findUserById(String id)
    {
        return repository.findById(id);
    }
}
