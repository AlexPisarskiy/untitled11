package com.company;

import java.util.ArrayList;

public class Database extends ArrayList
{
    ArrayList<User> db = new ArrayList <>();

    public void add(User user)
    {
        db.add(user);
    }

}
