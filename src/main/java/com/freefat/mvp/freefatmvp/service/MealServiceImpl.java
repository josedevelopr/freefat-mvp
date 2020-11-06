package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Meal;
import com.freefat.mvp.freefatmvp.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MealServiceImpl implements MealService
{
    @Autowired
    private MealRepository repository;

    @Override
    public Meal saveMeal(Meal meal) { return repository.save(meal); }

    @Override
    public List<Meal> findAllMeals() { return repository.findAll();}

    @Override
    public Optional<Meal> findMealById(String id) { return repository.findById(id); }
}
