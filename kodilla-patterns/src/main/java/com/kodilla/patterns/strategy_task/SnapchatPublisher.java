package com.kodilla.patterns.strategy_task;

public class SnapchatPublisher implements SocialPublisher{

    @Override
    public String share() {
        return ("Snapchat");
    }
}
