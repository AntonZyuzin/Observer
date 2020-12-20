package com.company;

public class Sub1 implements Observer {

    @Override
    public void update(String msg) {
        System.out.println(msg);
    }
}
