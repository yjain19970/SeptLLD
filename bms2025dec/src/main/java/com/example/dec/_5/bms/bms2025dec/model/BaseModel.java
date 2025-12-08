package com.example.dec._5.bms.bms2025dec.model;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter // This is an annotation
@Setter // This is an annotation
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    
    
    private Date createdAt;
    private Date updatedAt;
}
