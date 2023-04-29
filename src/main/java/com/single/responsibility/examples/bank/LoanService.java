package com.single.responsibility.examples.bank;

public class LoanService {

    public void getLoanInterestInfo(String loanType){
        if("HomeLoan".equals(loanType)){
            // Code to calculate Home Loan
        } else if("PersonalLoan".equals(loanType)){
            // Code to calculate Personal Loan
        } else if("CarLoan".equals(loanType)){
            // Code to calculate Car Loan
        }else{
            // Code to handle no match
        }
    }

}
