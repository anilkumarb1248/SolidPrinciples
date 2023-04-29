package com.interface_segregation.examples.upi.problem;

public class Phonepe implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashbackAsCreditBalance() {
        // This feature is not there in Paytm
        throw new RuntimeException("I don't support");
    }
}
