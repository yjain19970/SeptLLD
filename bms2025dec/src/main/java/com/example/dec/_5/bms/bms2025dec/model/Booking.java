package com.example.dec._5.bms.bms2025dec.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Booking extends BaseModel {
    private BookingStatus bookingStatus;
    // 
    private List<ShowSeat> showSeats;
    private User user;
    private Date bookingCreatedAt;
    //
    private Show show;
    private int amount;
    //
    private List<Payment> payments;
}
