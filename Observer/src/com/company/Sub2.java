package com.company;

import java.util.ArrayList;

public class Sub2 implements Observer {
    public static final ArrayList<String> journal = new ArrayList<>();


    @Override
    public void update(String msg) {
        journal.add(msg);
        System.out.println(journal);
    }
}
