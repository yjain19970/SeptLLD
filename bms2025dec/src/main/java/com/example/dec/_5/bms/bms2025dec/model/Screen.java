package com.example.dec._5.bms.bms2025dec.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;
    @OneToMany
    private List<Seat> seats;
    @ManyToMany
    private List<Feature> features;
}
