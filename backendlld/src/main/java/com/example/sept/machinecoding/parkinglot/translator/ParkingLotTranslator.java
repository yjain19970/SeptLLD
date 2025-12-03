package com.example.sept.machinecoding.parkinglot.translator;

import com.example.sept.machinecoding.parkinglot.dto.ParkingLotResponseDTO;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;

public class ParkingLotTranslator {

    public static ParkingLotResponseDTO convertParkingLotModelToDTO(ParkingLot parkingLot) {
        ParkingLotResponseDTO responseDTO = new ParkingLotResponseDTO();
        responseDTO.setCreatedAt(parkingLot.getCreatedAt());
        responseDTO.setFeesCalculatorStrategyType(parkingLot.getFeesCalculatorStrategyType());
        responseDTO.setGates(parkingLot.getGates());
        responseDTO.setLastModifiedAt(parkingLot.getLastModifiedAt());
        responseDTO.setParkingFloors(parkingLot.getParkingFloors());
        responseDTO.setParkingLotStatus(parkingLot.getParkingLotStatus());
        responseDTO.setSpotAssignmentStrategyType(parkingLot.getSpotAssignmentStrategyType());
        responseDTO.setVehicleTypes(parkingLot.getVehicleTypes());
        return responseDTO;
    }    
}
