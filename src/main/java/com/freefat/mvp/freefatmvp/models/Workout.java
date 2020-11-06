package com.freefat.mvp.freefatmvp.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workouts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Workout
{   @Id
    private String id = new ObjectId().toString();
    private int rewardPoints;
    private Step stepsList;
}
