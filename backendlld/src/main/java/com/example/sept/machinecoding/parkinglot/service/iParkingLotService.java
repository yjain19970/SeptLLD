package com.example.sept.machinecoding.parkinglot.service;

import java.util.List;

import com.example.sept.machinecoding.parkinglot.dto.ParkingLotRequestDTO;
import com.example.sept.machinecoding.parkinglot.model.FeesCalculatorStrategyType;
import com.example.sept.machinecoding.parkinglot.model.Gate;
import com.example.sept.machinecoding.parkinglot.model.ParkingFloor;
import com.example.sept.machinecoding.parkinglot.model.ParkingLot;
import com.example.sept.machinecoding.parkinglot.model.ParkingLotStatus;
import com.example.sept.machinecoding.parkinglot.model.VehicleType;

public interface iParkingLotService {


    ParkingLot createNewParkingLot(ParkingLotStatus parkingLotStatus, FeesCalculatorStrategyType feesCalculatorStrategyType,
            List<ParkingFloor> parkingFloors, List<Gate> gates, List<VehicleType> vehicleTypes);
    
}
