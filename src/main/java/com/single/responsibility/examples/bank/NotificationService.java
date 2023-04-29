package com.single.responsibility.examples.bank;

public class NotificationService {

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
