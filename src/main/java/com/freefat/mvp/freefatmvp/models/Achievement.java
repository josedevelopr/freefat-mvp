package com.freefat.mvp.freefatmvp.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "achievements")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Achievement
{   @Id
    private String id = new ObjectId().toString();
    private User userAchievement;
    private String kind;
    private int rewardPoints;
    private AchievementDetail[] achievementDetailList;
}
