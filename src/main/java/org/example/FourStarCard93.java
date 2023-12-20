package org.example;

public class FourStarCard93 implements AbstractCard93 {
    @Override
    public int getLevel() {
        return 4;
    }

    @Override
    public void showInfo(String name) {
        System.out.print("\033[95m"+ name+"\033[0m  ");
    }
}
