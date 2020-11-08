package com.freefat.mvp.freefatmvp.controller;

import com.freefat.mvp.freefatmvp.models.Workout;
import com.freefat.mvp.freefatmvp.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/freefat/workout"})
public class WorkoutController
{   @Autowired
    WorkoutService service;

    @PostMapping("/save")
    public Workout saveWorkout(@RequestBody Workout workout) { return service.saveWorkout(workout); }

    @PutMapping("/update/{id}")
    public Workout updateWorkout(@RequestBody Workout workout, @PathVariable("id") int id)
    {
        return null;//service.;
    }

    @GetMapping("/get/{id}")
    public Workout getWorkoutById(@PathVariable("id") String id) { return service.findWorkoutById(id).get(); }

    @GetMapping("/get-all")
    public List<Workout> getAllWorkouts() { return service.findAllWorkouts(); }
}
