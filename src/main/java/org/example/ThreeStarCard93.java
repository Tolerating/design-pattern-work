package org.example;

public class ThreeStarCard93 implements AbstractCard93 {

    @Override
    public int getLevel() {
        return 3;
    }

    @Override
    public void showInfo(String name) {
        System.out.print("\033[94m"+ name+"\033[0m  ");
    }
}
