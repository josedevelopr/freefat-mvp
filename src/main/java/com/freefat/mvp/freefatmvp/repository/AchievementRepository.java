package com.freefat.mvp.freefatmvp.repository;

import com.freefat.mvp.freefatmvp.models.Achievement;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface AchievementRepository extends MongoRepository<Achievement, String>
{   Achievement save(Achievement achievement);
    List<Achievement> findAll();
    Optional<Achievement> findById(String id);
}