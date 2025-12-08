package com.example.dec._5.bms.bms2025dec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private String externalRefNumber;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMethodType paymentMethodType;
    
}
