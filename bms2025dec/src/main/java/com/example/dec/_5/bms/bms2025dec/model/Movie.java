package com.example.dec._5.bms.bms2025dec.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String rating;
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> featuresList;
    @ManyToMany
    private List<Actor> actors;
    
}
