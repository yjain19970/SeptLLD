package com.example.sept.machinecoding.parkinglot.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bill extends BaseModel {
    private Date exitTime;
    private int amount;
    private Ticket ticket;
    private Gate gate; // ExitGate here.
    private Operator generatedBy; // Not needed.
    private BillStatus billStatus;
    private List<Payment> payments; // 
    private FeesCalculatorStrategyType feesCalculatorStrategyType;

    public Bill(Ticket ticket, Operator generatedBy){
        this.payments = new ArrayList<>();
        this.feesCalculatorStrategyType = FeesCalculatorStrategyType.STRAIGHT_FARE;
        this.exitTime = new Date();
        this.ticket = ticket;
        this.generatedBy = generatedBy;
        this.billStatus = BillStatus.IN_PROGRESS;
    }

    public Date getExitTime() {
        return exitTime;
    }
    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
    public Operator getGeneratedBy() {
        return generatedBy;
    }
    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }
    public BillStatus getBillStatus() {
        return billStatus;
    }
    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
        return feesCalculatorStrategyType;
    }

    public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }
}
