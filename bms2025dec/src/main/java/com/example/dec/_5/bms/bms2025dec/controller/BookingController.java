package com.example.dec._5.bms.bms2025dec.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dec._5.bms.bms2025dec.dto.BookingRequestDTO;
import com.example.dec._5.bms.bms2025dec.dto.BookingResponseDTO;
import com.example.dec._5.bms.bms2025dec.exception.BadRequestException;
import com.example.dec._5.bms.bms2025dec.model.Booking;
import com.example.dec._5.bms.bms2025dec.service.BookingServiceImpl;
import com.example.dec._5.bms.bms2025dec.translator.BookingTranslator;


@RestController
public class BookingController {
    @Autowired
    private BookingServiceImpl bookingServiceImpl;


    @PostMapping("/ticket")
    public BookingResponseDTO bookTicket(@RequestBody BookingRequestDTO dto) throws BadRequestException{
        if(invalidInputRequest(dto)){
            throw new BadRequestException();
        }

        BookingResponseDTO responseDTO= new BookingResponseDTO();
        try{
            Booking savedBooking =  bookingServiceImpl.bookMovieShow(dto.getUserId(), dto.getShowId(), dto.getSeatNumbers());
            responseDTO = BookingTranslator.toBookingResponseDTO(savedBooking);
        }catch(Exception e){
            // Hand the exception gracefully here.
            System.out.println("EXCEPTION OCCURRED. " + e);
        }
        return responseDTO;
    }

    /**
     * Returns TRUE when the request is INVALID.
     * @param dto
     * @return
     */
    private boolean invalidInputRequest(BookingRequestDTO dto) {
        if(Objects.isNull(dto)){
            return true;
        }
        if(dto.getSeatNumbers() == null ||  dto.getSeatNumbers().isEmpty()){
            return true;
        }
        if(Objects.isNull(dto.getShowId()) || Objects.isNull(dto.getUserId())){
            return true;
        }
        return false;
    }



}
