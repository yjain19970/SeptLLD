package com.example.dec._5.bms.bms2025dec.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dec._5.bms.bms2025dec.model.Show;

@Repository
// <Show,Long>  == Show is the table name, Long is the DataType of Key.
public interface ShowRepository extends JpaRepository<Show, Long> {
    @Override
    Optional<Show> findById(Long aLong);
}
