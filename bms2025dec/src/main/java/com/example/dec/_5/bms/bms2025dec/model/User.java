package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User extends BaseModel {
    private String uname;
    private String pwd;
}
