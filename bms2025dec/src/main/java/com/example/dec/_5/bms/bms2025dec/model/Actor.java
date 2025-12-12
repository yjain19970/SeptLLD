package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "actors") // SB will understand that it needs to create 
// a table for this class.
public class Actor extends BaseModel {
    private String name;
}
