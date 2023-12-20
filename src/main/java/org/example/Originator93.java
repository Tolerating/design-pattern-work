package org.example;

import java.util.ArrayList;

public class Originator93 {
    private ArrayList<AbstractDecorator93> state;

    public void setState(ArrayList<AbstractDecorator93> state){
        this.state = state;
    }

    public ArrayList<AbstractDecorator93> getState(){
        return state;
    }

    public Memento93 saveStateToMemento(){
        return new Memento93(state);
    }

    public void getStateFromMemento(Memento93 Memento){
        state = Memento.getState();
    }
}
