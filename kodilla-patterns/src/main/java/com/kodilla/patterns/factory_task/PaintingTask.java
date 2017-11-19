package com.kodilla.patterns.factory_task;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean closedTask;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        this.closedTask = true;
        System.out.println("Executed task: " + taskName + color + whatToPaint);

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
