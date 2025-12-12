package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show; // findAllByShow
    @ManyToOne
    private Seat seat;
    
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}
