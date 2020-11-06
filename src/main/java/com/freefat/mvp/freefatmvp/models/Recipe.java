package com.freefat.mvp.freefatmvp.models;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Recipe
{   @Id
    private String id = new ObjectId().toString();
    private String name;
    private Step[] stepsList;
}
