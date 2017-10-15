package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        //When
        List<String> TestUsersList = usersList(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(null);
        //Then
        Assert.assertEquals(0, statisticsMock.commentsCount());
        Assert.assertEquals(0, statisticsMock.postsCount());
        Assert.assertEquals(null, statisticsMock.usersNames());

    }

    @Test
    //posts = 1000; comments = 999; users = 100;
    public void Test2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statistics = new StatisticCounter(statisticsMock);
        //When
        List<String> TestUsersList = usersList(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(999);
        when(statisticsMock.usersNames()).thenReturn(TestUsersList);
        //Then
        statistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(100, statisticsMock.usersNames().size());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(999, statisticsMock.commentsCount());

    }

    @Test
    //posts = 1000; comments = 1001; users = 100;
    public void Test3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticCounter statistics = new StatisticCounter(statisticsMock);
        //When
        List<String> TestUsersList = usersList(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1001);
        when(statisticsMock.usersNames()).thenReturn(TestUsersList);
        //Then
        statistics.calculateAdvStatistics(statisticsMock);
        Assert.assertEquals(100, statisticsMock.usersNames().size());
        Assert.assertEquals(1000, statisticsMock.postsCount());
        Assert.assertEquals(1001, statisticsMock.commentsCount());

    }
}
