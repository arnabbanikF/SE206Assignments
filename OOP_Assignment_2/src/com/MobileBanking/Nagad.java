package com.MobileBanking;

public class Nagad extends Account{
    public Nagad(String name, String phoneNumber, String pin){
        super(name,phoneNumber,pin);
        setCashOutCharge(0.99);
    }
    public Nagad(String name, String phoneNumber){
        super (name,phoneNumber);
        setCashOutCharge(0.99);
    }
}
