package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Workout;
import com.freefat.mvp.freefatmvp.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutServiceImpl implements WorkoutService
{
    @Autowired
    private WorkoutRepository repository;

    @Override
    public Workout saveWorkout(Workout workout) { return repository.save(workout); }

    @Override
    public Workout updateWorkout(Workout workout) { return repository.save(workout); }

    @Override
    public List<Workout> findAllWorkouts() { return repository.findAll(); }

    @Override
    public Optional<Workout> findWorkoutById(String id) { return  repository.findById(id); }
}
