package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1, "John", 'M', LocalDate.of(1998, 1, 28), 5));
        theForumUserList.add(new ForumUser(2, "Michael", 'M', LocalDate.of(1998, 1, 3), 12));
        theForumUserList.add(new ForumUser(3, "Peter", 'M', LocalDate.of(1995, 4, 25), 24));
        theForumUserList.add(new ForumUser(4, "Mark", 'M', LocalDate.of(1999, 8, 7), 1));
        theForumUserList.add(new ForumUser(5, "Jo", 'F', LocalDate.of(2000, 1, 13), 0));
        theForumUserList.add(new ForumUser(6, "Philip", 'M', LocalDate.of(2001, 6, 28), 17));
        theForumUserList.add(new ForumUser(7, "Susan", 'F', LocalDate.of(1975, 4, 1), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
