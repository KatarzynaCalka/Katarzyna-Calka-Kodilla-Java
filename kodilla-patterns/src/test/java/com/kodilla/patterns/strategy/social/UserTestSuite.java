package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");

        //When
        String user1ShouldShare = user1.sharePost();
        System.out.println("User1 should: " + user1ShouldShare);
        String user2ShouldShare = user2.sharePost();
        System.out.println("User2 should: " + user2ShouldShare);
        String user3ShouldShare = user3.sharePost();
        System.out.println("User3 should: " + user3ShouldShare);

        //Then
        Assert.assertEquals("facebook", user1ShouldShare);
        Assert.assertEquals("twitter", user2ShouldShare);
        Assert.assertEquals("snapchat", user3ShouldShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user1 = new Millenials("User1");

        //When
        String user1ShouldShare = user1.sharePost();
        System.out.println("User1 should: " + user1ShouldShare);
        user1.setSocialPublisher(new TwitterPublisher());
        user1ShouldShare = user1.sharePost();
        System.out.println("User1 should: " + user1ShouldShare);

        //Then
        Assert.assertEquals("twitter", user1ShouldShare);
    }
}

