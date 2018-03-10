package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("b1")
    private TaskList toDoList;

    @Autowired
    @Qualifier("b2")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("b3")
    private TaskList doneList;

    @Bean
    public Board board(){
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "b1")
    @Scope("prototype")
    public TaskList toDoList(){
        return new TaskList();
    }

    @Bean(name = "b2")
    @Scope("prototype")
    public TaskList inProgressList(){
        return new TaskList();
    }

    @Bean(name = "b3")
    @Scope("prototype")
    public TaskList doneList(){
        return new TaskList();
    }
}
