package com.example.sept.machinecoding.parkinglot;

import java.util.HashMap;

import com.example.sept.machinecoding.parkinglot.controller.ParkingLotController;
import com.example.sept.machinecoding.parkinglot.controller.TicketController;
import com.example.sept.machinecoding.parkinglot.dto.ParkingLotResponseDTO;
import com.example.sept.machinecoding.parkinglot.dto.TicketRequestDTO;
import com.example.sept.machinecoding.parkinglot.impl.ParkingLotServiceImpl;
import com.example.sept.machinecoding.parkinglot.impl.TicketServiceImpl;
import com.example.sept.machinecoding.parkinglot.model.GateRepo;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.Vehicle;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;
import com.example.sept.machinecoding.parkinglot.repository.ParkingLotRepo;
import com.example.sept.machinecoding.parkinglot.repository.TicketRepo;
import com.example.sept.machinecoding.parkinglot.service.iParkingLotService;
import com.example.sept.machinecoding.parkinglot.service.iTicketService;
import com.example.sept.machinecoding.parkinglot.strategy.RandomSpotAssignmentStrategy;
import com.example.sept.machinecoding.parkinglot.strategy.iSpotAssignmentStrategy;

/*
 This is a client class....

*/
public class Driver {
    public static void main(String[] args) throws Exception {
        ParkingLotRepo parkingLotRepo = new ParkingLotRepo(new HashMap<>());
        GateRepo gateRepo = new GateRepo(new HashMap<>());
        TicketRepo ticketRepo = new TicketRepo(new HashMap<>());

        /*
            1. You will need to create parkingLot (by hitting the controller API)
            2. You will need to add Gates to parkingLot (by hitting the controller API)
            3. Finally you will need to hit the controller for Ticket. 
        */
        iSpotAssignmentStrategy iSpotAssignmentStrategy = new RandomSpotAssignmentStrategy();


        iParkingLotService parkingLotService = new ParkingLotServiceImpl(parkingLotRepo);
        iTicketService ticketServiceImpl = new TicketServiceImpl(parkingLotRepo,gateRepo, ticketRepo, iSpotAssignmentStrategy );
        
        ParkingLotController parkingLotController = new ParkingLotController(parkingLotService);
        TicketController ticketController = new TicketController(ticketServiceImpl);


        ParkingLotResponseDTO responseDTO =  parkingLotController.getParkingLot();

        
        /*
            1. Expose Gate Controller and hit the API from here
            2. Hit the Ticket controller from here.
            
        
        */
        
        
        
        
        
        
        TicketRequestDTO ticketRequestDTO = new TicketRequestDTO();
        ticketRequestDTO.setGateId(1L);
        ticketRequestDTO.setParkingLotId(101L);
        ticketRequestDTO.setVehicle(new Vehicle("KA01ZH55232", VehicleType.CAR, "Yash"));
        
        
        ticketController.generateTicket(ticketRequestDTO);
    }
}
