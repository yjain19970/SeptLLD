package com.example.dec._5.bms.bms2025dec.dto;

import java.util.List;

import com.example.dec._5.bms.bms2025dec.model.BookingStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponseDTO {
    private BookingStatus bookingStatus;
    private Long bookingId;
    private List<SeatDTO> bookedSeats;

    private ErrorDTO errorDTO;
}
