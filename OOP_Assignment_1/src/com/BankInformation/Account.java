package com.BankInformation;

public class Account {

    private String accountHolderName;
    private String accountPhoneNumber;
    private double balance = 10000;
    private String pin;

    public Account(String name, String phoneNumber, String pin){
        this.accountHolderName = name;
        this.accountPhoneNumber = phoneNumber;
        this.pin = pin;
    }
    public Account(String name, String phoneNumber){
        this.accountHolderName = name;
        this.accountPhoneNumber = phoneNumber;
        this.pin = "\0";
    }
    public boolean pinUpdate(String oldPin, String newPin){
        if (this.pin == "\0"){
            this.pin = newPin;
            System.out.println("New pin is set");
            return true;
        }
        if (this.pin == oldPin){
            this.pin = newPin;
            System.out.println("Pin updated");
            return true;
        }

        System.out.println("Pin does not match");
        return false;
    }

    public void addMoney(double amount){
        this.balance += amount;
        System.out.println(getAccountHolderName() + "| Add money: " + amount);
    }
    public void cashOut(double amount, String pin) {
        if (this.pin == "\0") {
            System.out.println("Pin is not set");
            return;
        }
        if (pin != this.pin) {
            System.out.println("Pin does not match");
        }

        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println(getAccountHolderName() + "| Cash out: " + amount + " New balance " + balance);
        } else {
            System.out.println(getAccountHolderName() + "| Insufficient balance");
        }
    }

    public String toString(){
        return "Account: {" + " Accout holder name " + accountHolderName + "| Phone number: " + accountPhoneNumber + "| Balance: " + balance + " }";
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public String getAccountPhoneNumber(){
        return this.accountPhoneNumber;
    }
    public double getBalance(){
        return this.balance;
    }
}
