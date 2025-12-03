package com.example.sept.machinecoding.parkinglot.model;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private List<ParkingSpot> parkingSpots;
    // One floor will have multiple parking spots.
    private int floorNumber;

    public ParkingFloor(int floorNo , List<ParkingSpot> spots){
        this.parkingSpots = spots;
        floorNumber = floorNo;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
