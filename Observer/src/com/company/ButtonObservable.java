package com.company;

import java.util.ArrayList;

public class ButtonObservable {

    private ArrayList<Observer> _subs = new ArrayList<>();

    public void addSub(Observer sub){
        _subs.add(sub);
    }

    public void removeSub(Observer sub){
        _subs.remove(sub);
    }

    public void updateSubs(String msg){
        for (Observer sub : _subs){
            sub.update(msg);
        }
    }
}
