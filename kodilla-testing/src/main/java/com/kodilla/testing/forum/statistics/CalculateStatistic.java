package com.kodilla.testing.forum.statistics;

public class CalculateStatistic {

    private double usersQuantity;
    private double postsQuantity;
    private double commentsQuantity;
    private double avePostPerUser;
    private double aveCommentsPerUser;
    private double aveCommentsPerPost;

    public void claculateAdvStatistic(Statistics statistic) {
        usersQuantity = statistic.usersNames().size();
        postsQuantity = statistic.postsCount();
        commentsQuantity = statistic.commentsCount();

        if (usersQuantity != 0) {
            avePostPerUser = postsQuantity / usersQuantity;
            aveCommentsPerUser = commentsQuantity / usersQuantity;
        }
        if (postsQuantity != 0) {
            aveCommentsPerPost = commentsQuantity / postsQuantity;
        }
    }

    public void showStatistics() {
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Avarage posts per user: " + avePostPerUser);
        System.out.println("Avarage comments per post: " + aveCommentsPerPost);
        System.out.println("Avarage comments per user: " + aveCommentsPerUser);
    }

    public double getUsersQuantity() {
        return usersQuantity;
    }

    public double getPostsQuantity() {
        return postsQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getAvePostPerUser() {
        return avePostPerUser;
    }

    public double getAveCommentsPerUser() {
        return aveCommentsPerUser;
    }

    public double getAveCommentsPerPost() {
        return aveCommentsPerPost;
    }
}
