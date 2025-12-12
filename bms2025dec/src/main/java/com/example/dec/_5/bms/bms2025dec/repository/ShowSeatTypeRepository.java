package com.example.dec._5.bms.bms2025dec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dec._5.bms.bms2025dec.model.SeatTypeShow;
import com.example.dec._5.bms.bms2025dec.model.Show;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<SeatTypeShow, Long> {

    
    List<SeatTypeShow> findAllByShow(Show show);
}