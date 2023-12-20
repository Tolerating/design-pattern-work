package org.example;

import java.util.ArrayList;
/*
观察者抽象类
 */
public abstract class Observer93 {
    protected Subject93 subject;
    public abstract void update(ArrayList<AbstractDecorator93> arrayList);
}
