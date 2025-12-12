package com.example.dec._5.bms.bms2025dec.translator;

import com.example.dec._5.bms.bms2025dec.dto.UserResponseDTO;
import com.example.dec._5.bms.bms2025dec.model.User;

public final class UserTranslator {
    private UserTranslator(){}



    public static UserResponseDTO toUserResponseDTO(User user){
        UserResponseDTO responseDTO = new UserResponseDTO();
        responseDTO.setUserId(user.getId());
        return responseDTO;
    }
}
