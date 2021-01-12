package com.MobileBanking;

public class Rocket extends Account {
    public Rocket(String name, String phoneNumber, String pin){
        super(name,phoneNumber,pin);
        setCashOutCharge(1.00);
    }
    public Rocket(String name, String phoneNumber){
        super (name,phoneNumber);
        setCashOutCharge(1.00);
    }
}
