package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int colNo;
    private int rowNo;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
