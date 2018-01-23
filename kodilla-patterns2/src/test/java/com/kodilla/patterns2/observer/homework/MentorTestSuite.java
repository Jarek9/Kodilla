package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TaskBoard jarekHomeworkTasks = new HomeworkTasks();
        TaskBoard adamHomeworkTasks = new HomeworkTasks();
        TaskBoard agnieszkaHomeworkTasks = new HomeworkTasks();
        TaskBoard klaudiaHomeworkTasks = new HomeworkTasks();
        Mentor janKowalski = new Mentor("Jan Kowalski");
        Mentor annaNowak = new Mentor("Anna Nowak");
        jarekHomeworkTasks.registerObserver(janKowalski);
        adamHomeworkTasks.registerObserver(annaNowak);
        agnieszkaHomeworkTasks.registerObserver(annaNowak);
        klaudiaHomeworkTasks.registerObserver(annaNowak);
        //When
        jarekHomeworkTasks.addTask("Finish your eDealer project");
        adamHomeworkTasks.addTask("Push to the GitHub Task 20.4");
        agnieszkaHomeworkTasks.addTask("Prepare CV");
        klaudiaHomeworkTasks.addTask("Creat FrontEnd of your application");
        //Then
        assertEquals(1, janKowalski.getUpdate());
        assertEquals(3, annaNowak.getUpdate());
    }
}
