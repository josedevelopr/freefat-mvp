package com.freefat.mvp.freefatmvp.controller;

import com.freefat.mvp.freefatmvp.models.Meal;
import com.freefat.mvp.freefatmvp.models.Workout;
import com.freefat.mvp.freefatmvp.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/freefat/meal"})
public class MealController
{   @Autowired
    MealService service;

    @PostMapping("/save")
    public Meal saveMeal(@RequestBody Meal meal) { return service.saveMeal(meal); }

    @GetMapping("/get/{id}")
    public Meal getMealById(@PathVariable("id") String id) { return service.findMealById(id).get(); }

    @GetMapping("/get-all")
    public List<Meal> getAllMeals() { return service.findAllMeals(); }
}
