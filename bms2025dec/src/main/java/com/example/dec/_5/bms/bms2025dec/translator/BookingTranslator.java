package com.example.dec._5.bms.bms2025dec.translator;

import java.util.ArrayList;
import java.util.List;

import com.example.dec._5.bms.bms2025dec.dto.BookingResponseDTO;
import com.example.dec._5.bms.bms2025dec.dto.SeatDTO;
import com.example.dec._5.bms.bms2025dec.model.Booking;
import com.example.dec._5.bms.bms2025dec.model.ShowSeat;

public final class BookingTranslator {
    private BookingTranslator(){}


    public static BookingResponseDTO toBookingResponseDTO(Booking booking){
        BookingResponseDTO responseDTO = new BookingResponseDTO();
        responseDTO.setBookedSeats(toBookedSeat(booking.getShowSeats()));
        responseDTO.setBookingId(booking.getId());
        responseDTO.setBookingStatus(booking.getBookingStatus());

        return responseDTO;
    }


    private static List<SeatDTO> toBookedSeat(List<ShowSeat> showSeats) {
        List<SeatDTO> seats = new ArrayList<>();
        for(ShowSeat showSeat : showSeats){
            SeatDTO seatDTO = new SeatDTO();
            
            seatDTO.setSeatId(showSeat.getSeat().getId());
            seatDTO.setSeatNumber(showSeat.getSeat().getSeatNumber());
            
            seats.add(seatDTO);
        }
        return seats;
    }
    
}
