package com.freefat.mvp.freefatmvp.repository;

import com.freefat.mvp.freefatmvp.models.Workout;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface WorkoutRepository extends MongoRepository<Workout, String>
{
    Workout save(Workout workout);
    List<Workout> findAll();
    Optional<Workout> findById(String id);
}
