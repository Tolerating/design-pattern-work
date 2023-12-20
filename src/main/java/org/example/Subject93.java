package org.example;

import java.util.ArrayList;

public interface Subject93 {
    void addObserver(Observer93 observer);
    void removeObserver(Observer93 observer);
    void notifyObserver(ArrayList<AbstractDecorator93> arrayList);
}
