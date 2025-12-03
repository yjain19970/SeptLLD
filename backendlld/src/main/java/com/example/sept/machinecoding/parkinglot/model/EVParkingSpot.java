package com.example.sept.machinecoding.parkinglot.model;

public class EVParkingSpot extends ParkingSpot {

    private Meter meter;

    public EVParkingSpot(int spotNumber) {
        super(spotNumber);
    }
    
    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    
}
