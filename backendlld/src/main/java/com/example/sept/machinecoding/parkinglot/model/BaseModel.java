package com.example.sept.machinecoding.parkinglot.model;

import java.util.Date;

public class BaseModel {
    private Long id; // AutoIncreament.
    private Date createdAt;
    private Date lastModifiedAt;
    // audit columns.

    public BaseModel(){
        
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }
    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}
