package com.freefat.mvp.freefatmvp.service;

import com.freefat.mvp.freefatmvp.models.Achievement;

import java.util.List;
import java.util.Optional;

public interface AchievementService
{   Achievement saveAchievement(Achievement achievement);
    Achievement updateAchievement(Achievement achievement);
    List<Achievement> findAllAchievements();
    Optional<Achievement> findAchievementById(String id);
}
