package com.freefat.mvp.freefatmvp.repository;

import com.freefat.mvp.freefatmvp.models.Meal;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface MealRepository extends MongoRepository<Meal, String>
{
    Meal save(Meal meal);
    List<Meal> findAll();
    Optional<Meal> findById(String id);
}
