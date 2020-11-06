package com.freefat.mvp.freefatmvp.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "steps")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Step
{   @Id
    private String id = new ObjectId().toString();
    private int number;
    private String description;
}
