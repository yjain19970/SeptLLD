package com.example.splitwisedec2025.dto;

public class SettleUpRequestDTO {
    private Long userId;

    

    public SettleUpRequestDTO(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
}
