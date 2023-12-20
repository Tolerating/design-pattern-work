package org.example;

import java.util.ArrayList;
/*
具体观察者类，更新背包物品
 */
public class WeaponBagObserver93 extends Observer93 {
    public WeaponBagObserver93(Subject93 subject){
        this.subject = subject;
        subject.addObserver(this);
    }

    @Override
    public void update(ArrayList<AbstractDecorator93> arrayList) {
        for (AbstractDecorator93 decorator : arrayList) {
            Common93.weaponBag.add(decorator);
        }
    }
}
