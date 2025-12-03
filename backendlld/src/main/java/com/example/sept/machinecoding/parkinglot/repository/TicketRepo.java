package com.example.sept.machinecoding.parkinglot.repository;

import java.util.Map;
import java.util.Optional;

import com.example.sept.machinecoding.parkinglot.model.Ticket;

public class TicketRepo {
     Map<Long,Ticket> ticketRepoMap; // this id should be increamental.
    private long lastSavedId;


    public TicketRepo(Map<Long, Ticket> ticketRepoMap) {
        this.ticketRepoMap = ticketRepoMap;
        this.lastSavedId = 0L;
    }

    public Optional<Ticket> getById(Long id){
        if(!ticketRepoMap.containsKey(id)){
            return Optional.empty();
        }

        return Optional.of(ticketRepoMap.get(id));
    }

    public Optional<Ticket> createTicket(Ticket parkingLot){
        lastSavedId++;
        
        parkingLot.setId(lastSavedId);
        System.out.println("LastSavedId: " + lastSavedId);
        ticketRepoMap.put(lastSavedId, parkingLot);
        System.out.println("ticketRepoMap: " + ticketRepoMap);

        return Optional.of(ticketRepoMap.get(lastSavedId));
    } 
}
