package com.example.sept.machinecoding.parkinglot.strategy;

import java.util.Optional;

import com.example.sept.machinecoding.parkinglot.model.ParkingFloor;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.ParkingSpot;
import com.example.sept.machinecoding.parkinglot.model.ParkingSpotStatus;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;

public class RandomSpotAssignmentStrategy implements iSpotAssignmentStrategy {

    @Override
    public Optional<ParkingSpot> findParkingSpot(ParkingLot parkingLot, VehicleType vehicleType) {
        
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getSupportedVehicleTypes().contains(vehicleType) && 
                    spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)){
                        return Optional.of(spot);
                }
            }
        }

        return Optional.empty();
    }
    
}
