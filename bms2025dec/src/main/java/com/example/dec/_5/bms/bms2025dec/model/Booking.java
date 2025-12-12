package com.example.dec._5.bms.bms2025dec.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // This is a little different....
public class Booking extends BaseModel {
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus; // ENUM
    @ManyToMany
    private List<ShowSeat> showSeats; // NP
    @ManyToOne
    private User user; // NP
    private Date bookingCreatedAt; // P
    @ManyToOne
    private Show show; // NP
    private int amount; // P
    @OneToMany
    private List<Payment> payments; // NP
}
