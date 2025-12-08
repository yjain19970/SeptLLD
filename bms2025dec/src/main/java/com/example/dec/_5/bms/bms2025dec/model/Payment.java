package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private String externalRefNumber;
    private int amount;
    //
    private PaymentStatus paymentStatus;
    //
    private PaymentMethodType paymentMethodType;
    
}
