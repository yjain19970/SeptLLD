package com.example.sept.machinecoding.parkinglot.strategy;

import java.util.Optional;

import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.ParkingSpot;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;

public interface iSpotAssignmentStrategy {

    Optional<ParkingSpot> findParkingSpot(ParkingLot parkingLot, VehicleType vehicleType);
    
}
