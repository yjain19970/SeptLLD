package com.example.sept.machinecoding.parkinglot.model;

import java.util.Arrays;
import java.util.List;

public class ParkingSpot extends BaseModel {
    private List<VehicleType> supportedVehicleTypes;
    // Since we are allowing multiple vehicle types, 
    // we are keeping this as a list. But one vehicle at a time
    // can be parked.
    private ParkingSpotStatus parkingSpotStatus;
    private int spotNumber;
    //private ParkingFloor parkingFloor;
    

    public ParkingSpot(int spotNumber) {
        this.supportedVehicleTypes = Arrays.asList(VehicleType.CAR);
        this.parkingSpotStatus = ParkingSpotStatus.EMPTY;
        this.spotNumber = spotNumber;
    }

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    // public ParkingFloor getParkingFloor() {
    //     return parkingFloor;
    // }

    // public void setParkingFloor(ParkingFloor parkingFloor) {
    //     this.parkingFloor = parkingFloor;
    // }
}
