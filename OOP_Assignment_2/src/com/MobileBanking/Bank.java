package com.MobileBanking;

public class Bank {
    public void startBanking(){
        String bkashUserName = "Bkash User";
        String bkashUserPhoneNum = "1111";
        String bkashUserPin = "1234";

        Bkash bkashUser = new Bkash(bkashUserName, bkashUserPhoneNum, bkashUserPin);
        System.out.println(bkashUser.toString());

        bkashUser.addMoney(1000);
        bkashUser.cashOut(500,bkashUserPhoneNum,bkashUserPin);

        String rocketUserName = "Rocket User";
        String rocketUserPhoneNum = "2222";
        String rocketUserPin = "54321";

        Rocket rocketUser = new Rocket(rocketUserName, rocketUserPhoneNum, rocketUserPin);
        System.out.println(rocketUser.toString());

        rocketUser.addMoney(1500);
        rocketUser.cashOut(600,rocketUserPhoneNum,rocketUserPin);


        String nagadUserName = "Nagad User";
        String nagadUserPhoneNum = "3333";
        String nagadUserPin = "6789";

        Nagad nagadUser = new Nagad(nagadUserName, nagadUserPhoneNum, nagadUserPin);
        System.out.println(nagadUser.toString());

        nagadUser.addMoney(2000);
        nagadUser.cashOut(1200,nagadUserPhoneNum,nagadUserPin);
    }
}
