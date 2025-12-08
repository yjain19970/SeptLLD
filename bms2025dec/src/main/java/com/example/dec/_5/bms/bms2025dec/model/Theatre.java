package com.example.dec._5.bms.bms2025dec.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    private List<Screen> screens;
    private City city;
}
