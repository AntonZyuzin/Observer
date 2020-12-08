package com.company;

import java.util.ArrayList;

public class Sub2 {
    public static final ArrayList<String> journal = new ArrayList<>();

    public static void history(String click) {
        journal.add(click);
        System.out.println(journal);
    }
}
