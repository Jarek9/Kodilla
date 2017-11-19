package com.kodilla.patterns.factory_task;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;
    boolean closedTask;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        this.closedTask = true;
        System.out.println("Executed task: " + taskName + where + " using " + using);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return closedTask;
    }
}
