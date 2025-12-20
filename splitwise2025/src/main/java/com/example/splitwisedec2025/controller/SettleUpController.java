package com.example.splitwisedec2025.controller;

import java.util.List;

import com.example.splitwisedec2025.dto.SettleUpRequestDTO;
import com.example.splitwisedec2025.dto.SettleUpResponseDTO;
import com.example.splitwisedec2025.model.Expense;
import com.example.splitwisedec2025.service.SettleUpServiceImpl;

public class SettleUpController {
    private SettleUpServiceImpl serviceImpl;
    
    public SettleUpResponseDTO settleUpUser(SettleUpRequestDTO requestDTO){
        // ToDo: Validate the Request.

        List<Expense> expenses =  serviceImpl.settleUpUser(requestDTO.getUserId());

        return new SettleUpResponseDTO();
    }
}
