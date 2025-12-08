package com.example.dec._5.bms.bms2025dec.model;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String rating;
    // 
    private List<Feature> featuresList;
    //
    private List<Actor> actors;
    
}
