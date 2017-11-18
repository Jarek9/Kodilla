package com.kodilla.patterns.strategy_task;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String sharePost() { return socialPublisher.share();}

    public void setSharePostStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
