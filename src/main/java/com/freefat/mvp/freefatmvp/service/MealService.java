package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Meal;

import java.util.List;
import java.util.Optional;

public interface MealService
{   Meal saveMeal(Meal meal);
    List<Meal> findAllMeals();
    Optional<Meal> findMealById(String id);
}
