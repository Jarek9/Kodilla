package com.kodilla.patterns.strategy_task;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Raptor");
        User user2 = new YGeneration("Evaporator");
        User user3 = new ZGeneration("Brajan");

        //When
        String user1FavoriteMedia = user1.sharePost();
        System.out.println("Raptor's favorite media is: " + user1FavoriteMedia);
        String user2FavoriteMedia = user2.sharePost();
        System.out.println("Evaporator's favorite media is: " + user2FavoriteMedia);
        String user3FavoriteMedia= user3.sharePost();
        System.out.println("Brajan's favorite media is: " + user3FavoriteMedia);

        //Then
        Assert.assertEquals("Facebook", user1FavoriteMedia);
        Assert.assertEquals("Twitter", user2FavoriteMedia);
        Assert.assertEquals("Snapchat", user3FavoriteMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Raptor");

        //When
        String user1FavoriteMedia = user1.sharePost();
        System.out.println("Raptor's favorite media is: " + user1FavoriteMedia);
        user1.setSharePostStrategy(new SnapchatPublisher());
        user1FavoriteMedia = user1.sharePost();
        System.out.println("Raptor is now publishing on: " + user1FavoriteMedia);

        //Then
        Assert.assertEquals("Snapchat", user1FavoriteMedia);
    }
}
