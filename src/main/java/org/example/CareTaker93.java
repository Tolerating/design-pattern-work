package org.example;

import java.util.ArrayList;
import java.util.List;

public class CareTaker93 {
    private List<Memento93> mementoList = new ArrayList<Memento93>();

    public void add(Memento93 state){
        mementoList.add(state);
    }

    public Memento93 get(int index){
        return mementoList.get(index);
    }
    public List<Memento93> all(){
        return mementoList;
    }
}
