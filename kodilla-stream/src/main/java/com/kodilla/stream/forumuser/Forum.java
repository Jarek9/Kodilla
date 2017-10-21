package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();


    public Forum() {
        usersList.add(new ForumUser(104589 , "Morgoth", 'M', LocalDate.of(2007,1,1),20 ));
        usersList.add(new ForumUser(104863 , "CORDELL", 'M', LocalDate.of(2001,11,10),100 ));
        usersList.add(new ForumUser(105717 , "Leon", 'M', LocalDate.of(2000,10,15),15 ));
        usersList.add(new ForumUser(108845 , "planetka", 'F', LocalDate.of(2002,8,29),42 ));
        usersList.add(new ForumUser(119491 , "Muminek24", 'M', LocalDate.of(2004,6,4),0 ));
        usersList.add(new ForumUser(124355 , "drink", 'M', LocalDate.of(1999,4,17),99 ));
        usersList.add(new ForumUser(124442 , "Opluty", 'M', LocalDate.of(1990,12,28),55 ));
        usersList.add(new ForumUser(149338 , "Garm", 'M', LocalDate.of(1992,1,1),3 ));
        usersList.add(new ForumUser(149556 , "misiu", 'M', LocalDate.of(1991,2,9),5 ));
        usersList.add(new ForumUser(150974 , "nieznajomy", 'M', LocalDate.of(1988,3,6),20 ));
        usersList.add(new ForumUser(151061 , "aniołkówna", 'F', LocalDate.of(1985,5,30),9 ));
        usersList.add(new ForumUser(152960 , "miisioo", 'M', LocalDate.of(1996,7,5),0 ));
        usersList.add(new ForumUser(164287 , "weles", 'M', LocalDate.of(2005,9,22),3 ));
        usersList.add(new ForumUser(164201 , "tlenek", 'M', LocalDate.of(1980,12,12),80 ));
        usersList.add(new ForumUser(164133 , "monica", 'F', LocalDate.of(1998,10,5),200 ));

    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
