package org.example;

import java.util.ArrayList;
import java.util.List;
/*
被观察者类
 */
public class SubjectImpl93 implements Subject93{
    private List<Observer93> observers = new ArrayList<Observer93>();

    @Override
    public void addObserver(Observer93 observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer93 observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(ArrayList<AbstractDecorator93> arrayList) {
        for (Observer93 observer : observers) {
            observer.update(arrayList);
        }
    }
}
