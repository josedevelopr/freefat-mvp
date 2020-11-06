package com.freefat.mvp.freefatmvp.repository;

import com.freefat.mvp.freefatmvp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String>
{
    User save(User user);
    Optional<User> findById(String id);
}
