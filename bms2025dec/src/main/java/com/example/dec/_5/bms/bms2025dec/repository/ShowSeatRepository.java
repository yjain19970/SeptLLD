package com.example.dec._5.bms.bms2025dec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dec._5.bms.bms2025dec.model.Show;
import com.example.dec._5.bms.bms2025dec.model.ShowSeat;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat,Long> {

    List<ShowSeat> findByShow(Show show); // ToDo: Cross check syntax for this later. 

    @Override
    ShowSeat save(ShowSeat entity); // update if ShowSeat has an ID, else insert        
}
