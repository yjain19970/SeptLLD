package com.example.dec._5.bms.bms2025dec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dec._5.bms.bms2025dec.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    @Override
    Optional<Booking> findById(Long id);

    @Override
    Booking save(Booking booking);
}
