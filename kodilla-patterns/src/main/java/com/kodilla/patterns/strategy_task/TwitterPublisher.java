package com.kodilla.patterns.strategy_task;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return ("Twitter");
    }
}
