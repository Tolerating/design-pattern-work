package org.example;

import java.util.ArrayList;

public class StrategyContext93 {
    private CardStrategy93 cardStrategy;

    public StrategyContext93(CardStrategy93 cardStrategy){
        this.cardStrategy = cardStrategy;
    }

    public ArrayList<AbstractDecorator93> executeStrategy(String upName,int pool){
       return cardStrategy.drawCard(upName,pool);
    }
}
