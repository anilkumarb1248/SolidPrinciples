package com.liskov.substitution.examples.socialmedia.problem;

public class InstagramService implements SocialMedia{
    @Override
    public void chatWithFriends() {
        // Code to chat with friends
    }

    @Override
    public void publishPost() {
        // Code to publish post
    }

    @Override
    public void sendPhotosAndVideos() {
        // Code to send photos and videos
    }

    @Override
    public void groupVideoCall() {
        throw new RuntimeException("Sorry, I don't support");
    }
}
