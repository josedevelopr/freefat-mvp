package com.freefat.mvp.freefatmvp.controller;

import com.freefat.mvp.freefatmvp.models.Achievement;
import com.freefat.mvp.freefatmvp.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping({"/freefat/achievement"})
public class AchievementController
{   @Autowired
    AchievementService service;

    @PostMapping("/save")
    public Achievement saveAchievement(@RequestBody Achievement achievement) { return service.saveAchievement(achievement); }

    @PutMapping("/update/{id}")
    public Achievement saveAchievement(@PathVariable("id") String id ,@RequestBody Achievement achievement)
    {   achievement.setId(id);
        return service.saveAchievement(achievement);
    }

    @GetMapping("/get/{id}")
    public Achievement getAchievementById(@PathVariable("id") String id) { return service.findAchievementById(id).get(); }

    @GetMapping("/get-all")
    public List<Achievement> getAllAchievements() { return service.findAllAchievements(); }
}