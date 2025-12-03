package com.example.sept.machinecoding.parkinglot.model;

import java.util.Map;
import java.util.Optional;

public class GateRepo {
    Map<Long,Gate> gateRepoMap; // this id should be increamental.
    private long lastSavedId;


    public GateRepo(Map<Long, Gate> gateRepoMap) {
        this.gateRepoMap = gateRepoMap;
        this.lastSavedId = 0L;
    }

    public Optional<Gate> getById(Long id){
        if(!gateRepoMap.containsKey(id)){
            return Optional.empty();
        }

        return Optional.of(gateRepoMap.get(id));
    }

    public Optional<Gate> createGate(Gate parkingLot){
        lastSavedId++;
        
        parkingLot.setId(lastSavedId);
        gateRepoMap.put(lastSavedId, parkingLot);

        return Optional.of(gateRepoMap.get(lastSavedId));
    } 
}
