package com.interface_segregation.examples.upi.problem;

public class GooglePay implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashbackAsCreditBalance() {
        // This feature is there in Google Pay
    }
}
