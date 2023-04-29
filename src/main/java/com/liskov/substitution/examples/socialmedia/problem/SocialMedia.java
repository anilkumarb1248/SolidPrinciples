package com.liskov.substitution.examples.socialmedia.problem;

public interface SocialMedia {

    //@Supports WhatsApp, Facebook, Instagram
    public void chatWithFriends();

    //@Supports Facebook, Instagram
    public void publishPost();

    //@Supports WhatsApp, Facebook, Instagram
    public void sendPhotosAndVideos();

    //@Supports WhatsApp, Facebook
    public void groupVideoCall();
}
