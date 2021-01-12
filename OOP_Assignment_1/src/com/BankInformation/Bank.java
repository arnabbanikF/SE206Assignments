package com.BankInformation;

public class Bank {

    public void startBanking(){
        String person_1_pin = "\0";
        String person_2_pin = "1234";

        Account person_1 = new Account("One","1111");
        Account person_2 = new Account("Two","2222",person_2_pin);

        System.out.println("Initial balance of person one: " + person_1.toString());
        System.out.println("Initial balance of person two: " + person_2.toString());

        person_1.addMoney(10000);
        person_2.addMoney(20000);

        person_2.cashOut(5000,person_2_pin);
        person_1.cashOut(100,person_1_pin);

        person_1_pin = person_1.pinUpdate(person_1_pin,"1234")?"1234":person_1_pin;

        person_2.cashOut(123,person_2_pin);
        person_1.cashOut(100,person_1_pin);
        person_1.cashOut(100,person_2_pin);

        person_1_pin = person_1.pinUpdate(person_1_pin,"9999")?"9999":person_1_pin;
        person_1.cashOut(1333,person_1_pin);

        System.out.println(person_1.getAccountHolderName() + ";" + person_1.getAccountPhoneNumber() + ";" + person_1.getBalance());
        System.out.println(person_2.getAccountHolderName() + ";" + person_2.getAccountPhoneNumber() + ";" + person_2.getBalance());

    }
}
