package com.example.sept.machinecoding.parkinglot.service;

import com.example.sept.machinecoding.parkinglot.model.Ticket;
import com.example.sept.machinecoding.parkinglot.model.Vehicle;

public interface iTicketService {

    Ticket generateTicket(Long gateId, Long parkingLotId, Vehicle vehicle) throws Exception;
    
}
