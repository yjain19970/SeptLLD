package com.example.sept.machinecoding.parkinglot.model;

public class Vehicle extends BaseModel {

    private String number;
    private VehicleType vehicleType;
    private String ownerName;

    

    public Vehicle(String number, VehicleType vehicleType, String ownerName) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
