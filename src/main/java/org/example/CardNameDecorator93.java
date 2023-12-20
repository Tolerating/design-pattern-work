package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CardNameDecorator93 extends AbstractDecorator93 {
    public CardNameDecorator93(AbstractCard93 decorateCard, String name) {
        super(decorateCard);
        this.name = name;
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        this.dateTime = ft.format(new Date());
    }
    public String getName(){
        return this.name;
    }

    public void display(){
        System.out.print(this.dateTime + " ");
        abstractCard.showInfo(this.name);
        System.out.println("");
    }
}
