package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Achievement;
import com.freefat.mvp.freefatmvp.repository.AchievementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AchievementServiceImpl implements AchievementService
{   @Autowired
    private AchievementRepository repository;

    @Override
    public Achievement saveAchievement(Achievement achievement) { return repository.save(achievement); }

    @Override
    public Achievement updateAchievement(Achievement achievement) { return repository.save(achievement); }

    @Override
    public List<Achievement> findAllAchievements() { return repository.findAll();}

    @Override
    public Optional<Achievement> findAchievementById(String id) { return  repository.findById(id); }
}
