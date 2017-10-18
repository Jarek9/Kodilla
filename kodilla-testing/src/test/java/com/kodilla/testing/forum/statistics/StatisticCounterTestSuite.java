package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class StatisticCounterTestSuite {
    private static int testCounter;


    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("Starting the tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests has been finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test no " + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test no " + testCounter + " finished");
    }

    public List<String> usersList(int listLength) {
        List<String> TestUsersList = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            String testUser = "User" + i;
            TestUsersList.add(testUser);
        }
        return TestUsersList;
    }

    @Test
    //posts = 0; comments = 0; users = 0;
    public void Test1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statistics = new StatisticCounter(statisticsMock);
        List<String> TestUsersList = usersList(0);
        //When
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(TestUsersList);
        statistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statistics.getAverageCommentsPerPost(),0);
        Assert.assertEquals(0, statistics.getAverageCommentsPerUser(),0);
        Assert.assertEquals(0, statistics.getAveragePostsPerUser(),0);
        Assert.assertEquals(0, statistics.getCommentsCount(),0);
        Assert.assertEquals(0, statistics.getPostsCount(),0);
        Assert.assertEquals(0, statistics.getUsersCount(),0);

    }

    @Test
    //posts = 1000; comments = 999; users = 100;
    public void Test2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statistics = new StatisticCounter(statisticsMock);
        List<String> TestUsersList = usersList(100);
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(999);
        when(statisticsMock.usersNames()).thenReturn(TestUsersList);
        statistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statistics.getAverageCommentsPerPost(),0);
        Assert.assertEquals(9, statistics.getAverageCommentsPerUser(),0);
        Assert.assertEquals(10, statistics.getAveragePostsPerUser(),0);
        Assert.assertEquals(999, statistics.getCommentsCount(),0);
        Assert.assertEquals(1000, statistics.getPostsCount(),0);
        Assert.assertEquals(100, statistics.getUsersCount(),0);

    }

    @Test
    //posts = 1000; comments = 1200; users = 300;
    public void Test3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statistics = new StatisticCounter(statisticsMock);
        List<String> TestUsersList = usersList(300);
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1200);
        when(statisticsMock.usersNames()).thenReturn(TestUsersList);
        statistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1.2, statistics.getAverageCommentsPerPost(),0);
        Assert.assertEquals(4, statistics.getAverageCommentsPerUser(),0);
        Assert.assertEquals(3, statistics.getAveragePostsPerUser(),0);
        Assert.assertEquals(1200, statistics.getCommentsCount(),0);
        Assert.assertEquals(1000, statistics.getPostsCount(),0);
        Assert.assertEquals(300, statistics.getUsersCount(),0);

    }
}
