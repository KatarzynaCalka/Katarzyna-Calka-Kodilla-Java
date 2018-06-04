package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorId;
    private int updateCount;

    public Mentor(String mentorId) {
        this.mentorId = mentorId;
    }

    public String getMentorId() {
        return mentorId;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println("Mentor id: " + mentorId +
                "; You get new task: " + taskQueue.getTasks().peekLast().getTaskId() +
                "; From student id: " + taskQueue.getStudentId());
        updateCount++;
    }
}
