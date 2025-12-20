package com.example.splitwisedec2025.service.command;

import java.util.ArrayList;
import java.util.List;

import com.example.splitwisedec2025.controller.SettleUpController;
import com.example.splitwisedec2025.dto.SettleUpRequestDTO;
import com.example.splitwisedec2025.dto.SettleUpResponseDTO;

public class SettleUpUserCommand implements iCommand {
    private SettleUpController settleUpController;

    public SettleUpUserCommand(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }

    @Override
    public boolean matches (String input) {
        // u1 settle up
        List <String> words = new ArrayList<>(); // GET COMMAND USING REGEX....
        if (words.size() == 2 && words.get(1).equalsIgnoreCase("SettleUp")) {
            return true;
        }
        return false;
    }

    @Override
    public void execute (String input) {
        List <String> words = new ArrayList<>(); // GET the words using a REGEX
        Long userId = Long.valueOf(words.get(0));
        SettleUpRequestDTO request = new SettleUpRequestDTO(userId);
        SettleUpResponseDTO response = settleUpController.settleUpUser(request);
    }
}
