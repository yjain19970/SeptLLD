package com.example.sept.machinecoding.parkinglot.dto;

import java.util.Date;
import java.util.List;

import com.example.sept.machinecoding.parkinglot.model.FeesCalculatorStrategyType;
import com.example.sept.machinecoding.parkinglot.model.Gate;
import com.example.sept.machinecoding.parkinglot.model.ParkingFloor;
import com.example.sept.machinecoding.parkinglot.model.ParkingLotStatus;
import com.example.sept.machinecoding.parkinglot.model.SpotAssignmentStrategyType;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;

public class ParkingLotResponseDTO {
    public List<ParkingFloor> parkingFloors;
    public List<Gate> gates;
    public List<VehicleType> vehicleTypes; // supported vehicle types in my parking lot.
    public ParkingLotStatus parkingLotStatus;
    public SpotAssignmentStrategyType spotAssignmentStrategyType;
    public FeesCalculatorStrategyType feesCalculatorStrategyType;  
    public Long id; // id of the parkingLot.
    public Date createdAt;
    public Date lastModifiedAt;
    

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
    public Long getId() {
        return id;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public Date getLastModifiedAt() {
        return lastModifiedAt;
    }
    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }
    public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public void setLastModifiedAt(Date lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    } 
    
    
}
