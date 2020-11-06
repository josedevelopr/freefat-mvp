package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Workout;

import java.util.List;
import java.util.Optional;

public interface WorkoutService
{
    Workout saveWorkout(Workout workout);
    List<Workout> findAllWorkouts();
    Optional<Workout> findWorkoutById(String id);
}
