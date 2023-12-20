package org.example;

public abstract class AbstractDecorator93 implements AbstractCard93 {
    protected String name;
    protected String dateTime;
    protected AbstractCard93 abstractCard;
    public AbstractDecorator93(AbstractCard93 decorateCard){
        this.abstractCard = decorateCard;
    }
    public int getLevel(){
        return abstractCard.getLevel();
    }
    public void showInfo(String name){
        abstractCard.showInfo(name);
    }

    public String getName() {
        return null;
    }
    public void printName(){
        abstractCard.showInfo(name);
    }

    public void display(){}
}
