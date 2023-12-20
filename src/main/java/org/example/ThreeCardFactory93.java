package org.example;

public class ThreeCardFactory93 extends AbstractFactory93 {

    @Override
    public AbstractCard93 createCard() {
        return new ThreeStarCard93();
    }
}
