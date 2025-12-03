package com.example.sept.machinecoding.parkinglot.controller;

import com.example.sept.machinecoding.parkinglot.dto.ParkingLotRequestDTO;
import com.example.sept.machinecoding.parkinglot.dto.ParkingLotResponseDTO;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.service.iParkingLotService;
import com.example.sept.machinecoding.parkinglot.translator.ParkingLotTranslator;

public class ParkingLotController {
    private iParkingLotService parkingLotService;

    public ParkingLotController(iParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    public ParkingLotResponseDTO createParkingLot(ParkingLotRequestDTO dto){
        ParkingLot parkingLot =  parkingLotService.createNewParkingLot(
            dto.getParkingLotStatus(), 
            dto.getFeesCalculatorStrategyType(),
            dto.getParkingFloors(),
            dto.getGates(),
            dto.getVehicleTypes());

        ParkingLotResponseDTO response =  ParkingLotTranslator.convertParkingLotModelToDTO(parkingLot);
        System.out.println("Saved ParkingLot to DB...");
        return response;
    }

    public ParkingLotResponseDTO getParkingLot(){
        return null;
    }
    

    
}
