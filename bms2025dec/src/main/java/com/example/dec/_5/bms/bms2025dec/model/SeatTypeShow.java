package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
// This model is responsible for
// defining the price of a seat for a show.
public class SeatTypeShow extends BaseModel {
    private Show show;
    private SeatType seatType;
    private int price;
}
