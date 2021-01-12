package com.MobileBanking;

public class Bkash extends Account{
    public Bkash(String name, String phoneNumber, String pin){
        super(name,phoneNumber,pin);
        setCashOutCharge(1.85);
    }
    public Bkash(String name, String phoneNumber){
        super (name,phoneNumber);
        setCashOutCharge(1.85);
    }
}
