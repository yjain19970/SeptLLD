package com.example.sept.machinecoding.parkinglot.controller;

import com.example.sept.machinecoding.parkinglot.dto.TicketRequestDTO;
import com.example.sept.machinecoding.parkinglot.dto.TicketResponseDTO;
import com.example.sept.machinecoding.parkinglot.model.Ticket;
import com.example.sept.machinecoding.parkinglot.service.iTicketService;
import com.example.sept.machinecoding.parkinglot.translator.TicketTranslator;

public class TicketController {
    private iTicketService ticketService;

    public TicketController(iTicketService ticketService) {
        this.ticketService = ticketService;
    }
    
    public TicketResponseDTO generateTicket(TicketRequestDTO dto) throws Exception{
       Ticket response =   ticketService.generateTicket(dto.getGateId(), dto.getParkingLotId(), dto.getVehicle());
        
       TicketResponseDTO responseDTO =  TicketTranslator.convertTicketToResponseDTO(response);
       return responseDTO;
    }
    
}
