package org.example;

public class FiveCardFactory93 extends AbstractFactory93 {
    @Override
    public AbstractCard93 createCard() {
        return new FiveStarCard93();
    }
}
