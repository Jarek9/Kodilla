package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{

    private final String mentorname;
    private int update;

    public Mentor(String mentorname) {
        this.mentorname = mentorname;
    }


    @Override
    public void update(TaskBoard taskBoard) {
        System.out.println(mentorname + ": New task appeared on TaskBoard " + taskBoard.getName()  + "\n"
                + "(total: " + taskBoard.getTasks().size() + " tasks");
        update++;
    }

    public String getMentorname() {
        return mentorname;
    }

    public int getUpdate() {
        return update;
    }
}
