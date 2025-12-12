package com.example.dec._5.bms.bms2025dec.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingRequestDTO {
    private List<String> seatNumbers;
    private Long showId;
    private Long userId;
}
/**
 * 
 * {
 *  "showId" : 1234,
 *  "userId" : 1111,
 *  "seatNumber" : ["3232","23232"]
 * }
 * 
 * 
 * 
 * You can test all of this using `POSTMAN`
 * 
 * 
 * 
 */