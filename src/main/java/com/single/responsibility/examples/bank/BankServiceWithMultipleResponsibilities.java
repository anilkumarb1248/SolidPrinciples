package com.single.responsibility.examples.bank;

public class BankServiceWithMultipleResponsibilities {

    public Integer deposit(Integer amount, String accountNo){
        // Code to deposit amount
        return 0;
    }

    public Integer withdraw(Integer amount, String accountNo){
        // Code to withdraw amount
        return 0;
    }

    public void printPassbook(String accountNo){
        // Code to print the passbook
    }

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

    public void sendOTP(String medium){
        if("mail".equals(medium)){
            // Code to send otp to email (JavaMailSenderApi)
        } else if("mobile".equals(medium)){
            // Code to send otp to mobile (Twillio API)
        } else{
            // Code to handle no match
        }
    }
}
