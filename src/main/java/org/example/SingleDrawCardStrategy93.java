package org.example;

import java.util.ArrayList;

public class SingleDrawCardStrategy93 implements CardStrategy93 {
    @Override
    public ArrayList<AbstractDecorator93> drawCard(String upName,int pool) {
        ArrayList<AbstractDecorator93> arrayList = new ArrayList<>();
        int random = (int)(Math.random()*100);
        Common93.drawedNum++;
        if(Common93.triggerBaodi()){
            Common93.drawedNum=0;
            arrayList.add(new CardNameDecorator93(new FiveCardFactory93().createCard(),upName));
        }
        if (random < Common93.THREE_STAR_PROBABILITY){
             arrayList.add(new CardNameDecorator93(new ThreeCardFactory93().createCard(), Weapon93.getRandomElement(3,pool)));
        }else if(random < Common93.THREE_STAR_PROBABILITY + Common93.FOUR_STAR_PROBABILITY){
            arrayList.add(new CardNameDecorator93(new FourthtCardFactory93().createCard(), Weapon93.getRandomElement(4,pool)));
        }else{
            String name = Weapon93.getRandomElement(5,pool);
            if (name==upName){
                Common93.drawedNum = 0;
            }
            arrayList.add(new CardNameDecorator93(new FiveCardFactory93().createCard(), name));
        }
        return arrayList;
    }

}
