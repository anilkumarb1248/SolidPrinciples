package com.open.closed.examples.notification;

/***
 * Here Notification service is handling only mail and mobile OTP generation.
 * In future, if we want to implement the WhatsApp or any other medium, we need to modify this class.
 * But it is not a good programming approach, because this functionality is already fully tested.
 *
 * To resolve this problem, we need to design the code in such a way that a new medium can add easily.
 *
 * First we need to implement one interface: NotificationService which contains "sendOTP" method.
 * All the mediums can implement this interface as:
 *
 * MobileNotification implements NotificationService{}
 * MailNotification implements NotificationService{}
 * WhatsAppNotification implements NotificationService{}
 */
public class NotificationServiceWithoutOpenClosedPrinciple {

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
