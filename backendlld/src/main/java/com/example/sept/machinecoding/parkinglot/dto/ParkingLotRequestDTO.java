package com.example.sept.machinecoding.parkinglot.dto;

import java.util.List;

import com.example.sept.machinecoding.parkinglot.model.FeesCalculatorStrategyType;
import com.example.sept.machinecoding.parkinglot.model.Gate;
import com.example.sept.machinecoding.parkinglot.model.ParkingFloor;
import com.example.sept.machinecoding.parkinglot.model.ParkingLotStatus;
import com.example.sept.machinecoding.parkinglot.model.SpotAssignmentStrategyType;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;

public class ParkingLotRequestDTO {
    public List<ParkingFloor> parkingFloors;
    public List<Gate> gates;
    public List<VehicleType> vehicleTypes; // supported vehicle types in my parking lot.
    public ParkingLotStatus parkingLotStatus;
    public SpotAssignmentStrategyType spotAssignmentStrategyType;
    public FeesCalculatorStrategyType feesCalculatorStrategyType;
    
    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
    public List<Gate> getGates() {
        return gates;
    }
    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }
    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }
    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }
    public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
        return feesCalculatorStrategyType;
    }

    

}
