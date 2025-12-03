package com.example.sept.machinecoding.parkinglot.impl;

import java.util.List;

import com.example.sept.machinecoding.parkinglot.dto.ParkingLotRequestDTO;
import com.example.sept.machinecoding.parkinglot.model.FeesCalculatorStrategyType;
import com.example.sept.machinecoding.parkinglot.model.Gate;
import com.example.sept.machinecoding.parkinglot.model.ParkingFloor;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.ParkingLotStatus;
import com.example.sept.machinecoding.parkinglot.model.SpotAssignmentStrategyType;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;
import com.example.sept.machinecoding.parkinglot.repository.ParkingLotRepo;
import com.example.sept.machinecoding.parkinglot.service.iParkingLotService;


public class ParkingLotServiceImpl implements iParkingLotService {
    private ParkingLotRepo parkingLotRepo;

    public ParkingLotServiceImpl(ParkingLotRepo parkingLotRepo){
        this.parkingLotRepo = parkingLotRepo;
    }

    @Override
    public ParkingLot createNewParkingLot(ParkingLotStatus parkingLotStatus,
            FeesCalculatorStrategyType feesCalculatorStrategyType, List<ParkingFloor> parkingFloors, List<Gate> gates,
            List<VehicleType> vehicleTypes) {
        
        ParkingLot parkingLot = new ParkingLot(parkingFloors, gates, vehicleTypes, parkingLotStatus, SpotAssignmentStrategyType.MANUAL, feesCalculatorStrategyType);
        ParkingLot response =  parkingLotRepo.saveParkingLot(parkingLot).get();
        return response;
    }

}
