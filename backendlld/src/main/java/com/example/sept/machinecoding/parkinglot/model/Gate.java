package com.example.sept.machinecoding.parkinglot.model;

public class Gate extends BaseModel {

    private GateType gateType;
    private int gateNumber;
    private Operator currentOperator;
    private GateStatus gateStatus;

    public Gate(GateType type, int no, Operator operator){
        this.gateType = type;
        this.gateNumber = no;
        this.currentOperator = operator;
        this.gateStatus  =GateStatus.ACTIVE;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getCurrentOperator() {
        return currentOperator;
    }

    public void setCurrentOperator(Operator currentOperator) {
        this.currentOperator = currentOperator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
