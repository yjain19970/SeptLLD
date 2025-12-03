package com.example.sept.machinecoding.parkinglot.impl;

import java.util.Optional;

import com.example.sept.machinecoding.parkinglot.model.Gate;
import com.example.sept.machinecoding.parkinglot.model.GateRepo;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.ParkingSpot;
import com.example.sept.machinecoding.parkinglot.model.Ticket;
import com.example.sept.machinecoding.parkinglot.model.Vehicle;
import com.example.sept.machinecoding.parkinglot.repository.ParkingLotRepo;
import com.example.sept.machinecoding.parkinglot.repository.TicketRepo;
import com.example.sept.machinecoding.parkinglot.service.iTicketService;
import com.example.sept.machinecoding.parkinglot.strategy.iSpotAssignmentStrategy;

public class TicketServiceImpl implements iTicketService {
    private ParkingLotRepo parkingLotRepo;
    private GateRepo gateRepo;
    private TicketRepo ticketRepo;
    private iSpotAssignmentStrategy iSpotAssignmentStrategy;

    


    public TicketServiceImpl(ParkingLotRepo parkingLotRepo, GateRepo gateRepo, TicketRepo ticketRepo,
            com.example.sept.machinecoding.parkinglot.strategy.iSpotAssignmentStrategy iSpotAssignmentStrategy) {
        this.parkingLotRepo = parkingLotRepo;
        this.gateRepo = gateRepo;
        this.ticketRepo = ticketRepo;
        this.iSpotAssignmentStrategy = iSpotAssignmentStrategy;
    }




    @Override
    public Ticket generateTicket(Long gateId, Long parkingLotId, Vehicle vehicle) throws Exception {
        /*
        0. Get ParkingLot from PrkingLotId and fetch the spots.
        1. check whether their is EMPTY spot available or not.
        2. Get the Gate from the gateId
        3. Assign the spot automatically.
        4. Create ticket Object.
        5. Save the ticket Object in Repo
        6. Return the response./
        */

        Optional<ParkingLot> parkOptional =  parkingLotRepo.getById(parkingLotId);
        if(parkOptional.isEmpty()){
            throw new Exception("Parking lot does not exist.");
        }
        
        Optional<Gate> gateOptional =gateRepo.getById(gateId);
        if(gateOptional.isEmpty()){
            throw new Exception("Gate does not exist.");
        }

        ParkingLot parkingLot = parkOptional.get();
        Gate gate = gateOptional.get();

        Optional<ParkingSpot> avOptional =  iSpotAssignmentStrategy.findParkingSpot(parkingLot, vehicle.getVehicleType());
        if(avOptional.isEmpty()){
            throw new Exception("ParkingSpot not available.....");
        }
        ParkingSpot avParkingSpot = avOptional.get();
        

        Ticket newTicket = new Ticket(vehicle, gate, null, avParkingSpot);
        Ticket ticketWithId =  ticketRepo.createTicket(newTicket).get();
        return ticketWithId;
    }
    
}
