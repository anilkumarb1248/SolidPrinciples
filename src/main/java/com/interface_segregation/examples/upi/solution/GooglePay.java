package com.interface_segregation.examples.upi.solution;

public class GooglePay implements UPIPayments, CashbackService {
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
