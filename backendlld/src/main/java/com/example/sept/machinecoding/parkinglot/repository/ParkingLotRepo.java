package com.example.sept.machinecoding.parkinglot.repository;

import java.util.Map;
import java.util.Optional;

import com.example.sept.machinecoding.parkinglot.model.ParkingLot;

public class ParkingLotRepo {
    private Map<Long,ParkingLot> parkingLotRepo; // this id should be increamental.
    private long lastSavedId;


    public ParkingLotRepo(Map<Long, ParkingLot> parkingLotRepo) {
        this.parkingLotRepo = parkingLotRepo;
        this.lastSavedId = 0L;
    }

   
    public Optional<ParkingLot> getById(Long id){
        if(!parkingLotRepo.containsKey(id)){
            return Optional.empty();
        }

        return Optional.of(parkingLotRepo.get(id));
    }


    public Optional<ParkingLot> saveParkingLot(ParkingLot parkingLot){
        lastSavedId++;
        
        parkingLot.setId(lastSavedId);
        parkingLotRepo.put(lastSavedId, parkingLot);


        return Optional.of(parkingLotRepo.get(lastSavedId));
    }
    
}