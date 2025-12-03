package com.example.sept.machinecoding.parkinglot.translator;

import com.example.sept.machinecoding.parkinglot.dto.TicketResponseDTO;
import com.example.sept.machinecoding.parkinglot.model.Ticket;

public class TicketTranslator {

    public static TicketResponseDTO convertTicketToResponseDTO(Ticket response) {
        return new TicketResponseDTO();
    }
    
}
