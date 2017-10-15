package com.kodilla.testing.forum.statistics;

public class StatisticCounter {
    Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        averagePostsPerUser = postsCount / usersCount;
        averageCommentsPerUser = commentsCount / usersCount;
        averageCommentsPerPost = commentsCount / postsCount;
    }

    public void printAdvStatistics() {
        System.out.println("Users quantity: " + getUsersCount() + "\nPosts quantity: " + getPostsCount()
        + "\nComments quantity: " + getCommentsCount() + "\nAverage posts per user: " + getAveragePostsPerUser()
        + "\nAverage comments per User: " + getAverageCommentsPerUser() + "\nAverage comments per post: " +
        getAverageCommentsPerPost());
    }
}
