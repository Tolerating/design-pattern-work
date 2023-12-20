package org.example;

import java.util.ArrayList;
/*
具体观察者类，打印抽卡结果
 */
public class DrawResutlObserver93 extends Observer93 {
    public DrawResutlObserver93(Subject93 subject){
        this.subject = subject;
        subject.addObserver(this);
    }
    @Override
    public void update(ArrayList<AbstractDecorator93> arrayList) {
        System.out.println("====================================================================");
        System.out.println("抽卡结果：");
        for (AbstractDecorator93 decorator : arrayList) {
//            System.out.print(" "+decorator.getName()+" ");
            decorator.printName();
        }
        System.out.println("\n距离保底还有："+ (Common93.baodiNum - Common93.drawedNum));
        System.out.println("====================================================================\n");
    }
}
