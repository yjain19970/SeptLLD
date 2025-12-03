package com.example.sept.machinecoding.parkinglot.dto;


import com.example.sept.machinecoding.parkinglot.model.Vehicle;

/*
1
2
3 ---> P3. 
4
5



*/


// DataTransferObject
public class TicketRequestDTO {
    private Vehicle vehicle;
    private Long parkingLotId; // ParkingLOt1
    private Long gateId; // Gate1
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Long getParkingLotId() {
        return parkingLotId;
    }
    public void setParkingLotId(Long parkingLotId) {
        this.parkingLotId = parkingLotId;
    }
    public Long getGateId() {
        return gateId;
    }
    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    
}
