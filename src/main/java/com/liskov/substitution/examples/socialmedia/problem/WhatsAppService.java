package com.liskov.substitution.examples.socialmedia.problem;

public class WhatsAppService implements SocialMedia{
    @Override
    public void chatWithFriends() {
        // Code to chat with friends
    }

    @Override
    public void publishPost() {
       throw new RuntimeException("Sorry, I don't support");
    }

    @Override
    public void sendPhotosAndVideos() {
        // Code to send photos and videos
    }

    @Override
    public void groupVideoCall() {
        // Code to group video call
    }
}
