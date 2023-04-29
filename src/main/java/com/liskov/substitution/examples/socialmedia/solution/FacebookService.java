package com.liskov.substitution.examples.socialmedia.solution;


public class FacebookService implements SocialMedia, PostsManager, VideoCallManager {
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
        // Code to group video call
    }
}
