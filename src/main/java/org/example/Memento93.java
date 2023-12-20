package org.example;

import java.util.ArrayList;

public class Memento93 {
    private ArrayList<AbstractDecorator93> state;

    public Memento93(ArrayList<AbstractDecorator93> state) {
        this.state = state;
    }

    public ArrayList<AbstractDecorator93> getState() {
        return state;
    }
}
