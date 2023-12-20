package org.example;

public class FiveStarCard93 implements AbstractCard93 {
    @Override
    public int getLevel() {
        return 5;
    }

    @Override
    public void showInfo(String name) {
        System.out.print("\033[33m"+ name+"\033[0m  ");
    }
}
