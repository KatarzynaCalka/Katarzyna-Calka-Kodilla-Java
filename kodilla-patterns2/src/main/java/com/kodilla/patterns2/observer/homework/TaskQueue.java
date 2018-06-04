package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable{

    private final List<Observer> observers;
    private final ArrayDeque<Task> tasks;
    private final String studentId;

    public TaskQueue(String studentId) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.studentId = studentId;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public ArrayDeque<Task> getTasks() {
        return tasks;
    }

    public String getStudentId() {
        return studentId;
    }

    public void addTask(Task task){
        tasks.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
