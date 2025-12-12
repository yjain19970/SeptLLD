package com.example.dec._5.bms.bms2025dec.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dec._5.bms.bms2025dec.exception.SeatNotAvailableException;
import com.example.dec._5.bms.bms2025dec.exception.ShowDoesNotExistException;
import com.example.dec._5.bms.bms2025dec.exception.UserDoesNotExistException;
import com.example.dec._5.bms.bms2025dec.model.Booking;
import com.example.dec._5.bms.bms2025dec.model.BookingStatus;
import com.example.dec._5.bms.bms2025dec.model.Show;
import com.example.dec._5.bms.bms2025dec.model.ShowSeat;
import com.example.dec._5.bms.bms2025dec.model.ShowSeatStatus;
import com.example.dec._5.bms.bms2025dec.model.User;
import com.example.dec._5.bms.bms2025dec.repository.BookingRepository;
import com.example.dec._5.bms.bms2025dec.repository.ShowRepository;
import com.example.dec._5.bms.bms2025dec.repository.ShowSeatRepository;
import com.example.dec._5.bms.bms2025dec.repository.ShowSeatTypeRepository;
import com.example.dec._5.bms.bms2025dec.repository.UserRepository;

@Service // considers that class as singleton object.
// it becomes the responsibility of SB to create object of that clas.....
public class BookingServiceImpl {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private ShowRepository showRepository;
    @Autowired
    private ShowSeatRepository showSeatRepository;
    @Autowired
    private ShowSeatTypeRepository showSeatTypeRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ReentrantLock lock;


    public Booking bookMovieShow(Long userId, Long showId, List<String> seatNumber) throws UserDoesNotExistException, ShowDoesNotExistException, SeatNotAvailableException{
        // start transaction.
        // TAKE A LOCK HERE
        // GET THE USER WITH USER_ID from DB
        // GET SHOW USING SHOW_ID from DB
        // -------- TAKE LOCK ------------

        // Get the showSeat with the given seatIds for that given show
        // Check if all the seats (selected or requested) are having status as AVAILABLE
        // If no, throw ERRIR
        // If yes --> Then update the seat status as `LOCKED` in the DB
        // SAVE the DATA
        // -------- RELEASE LOCK ------------

        // Create the corresponding BookingObject
        // Update that BookingObject using BOoking Repo.
        // Return the booking object with ID inside it
            // (you will get the id once you save the object in table)
        
        
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new UserDoesNotExistException();
        }

        User user = userOptional.get(); // THIS IS THE USER WHO HAS REQUESTED BOOKING.

        Optional<Show> showOptional = showRepository.findById(showId);
        if(showOptional.isEmpty()){
            throw new ShowDoesNotExistException();
        }

        Show show = showOptional.get();
        
        lock.lock(); 

        // ToDo: check syntax for the below code once. 
        List<ShowSeat> showSeats =  showSeatRepository.findByShow(show);

        for(ShowSeat showSeat : showSeats){
            if(seatNumber.contains(showSeat.getSeat().getSeatNumber()) && 
                !showSeat.getShowSeatStatus().equals(ShowSeatStatus.AVAILABLE)){
                
                    throw new SeatNotAvailableException();
            }
        }

        // Update the status of above showSeats to BLOCKED state.
        List<ShowSeat> savedSeats = new ArrayList<>();
        for(ShowSeat showSeat : showSeats){
            if(seatNumber.contains(showSeat.getSeat().getSeatNumber())){
                showSeat.setShowSeatStatus(ShowSeatStatus.BLOCKED);
                savedSeats.add(showSeatRepository.save(showSeat));
            }
        }
        // RELEASE THE LOCK
        lock.unlock();


        Booking booking = new Booking();
        booking.setAmount(0);
        booking.setBookingCreatedAt(new Date());
        booking.setBookingStatus(BookingStatus.CREATED);
        booking.setShowSeats(showSeats);
        booking.setShow(show);
        booking.setUser(user);
        Booking savedBooking = bookingRepository.save(booking);
        return savedBooking;
    }
    
}

// new BookingServiceImpl();
