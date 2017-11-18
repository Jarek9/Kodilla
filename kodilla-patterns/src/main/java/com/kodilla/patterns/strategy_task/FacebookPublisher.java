package com.kodilla.patterns.strategy_task;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return ("Facebook");
    }
}
