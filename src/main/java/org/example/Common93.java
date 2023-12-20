package org.example;

import java.util.ArrayList;

public class Common93 {
    public static int baodiNum = 60;
    public static int drawedNum = 0;
    public static ArrayList<AbstractDecorator93> weaponBag = new ArrayList<>();
//    三星概率
    public static final int THREE_STAR_PROBABILITY = 88;
//    四星概率
    public static final int FOUR_STAR_PROBABILITY = 10;
//    五星概率
    public static final int FIVE_STAR_PROBABILITY = 2;

    public static void showBag(){
        int flag = 0;
        for (AbstractDecorator93 cardNameDecorator : weaponBag) {
            flag++;
            cardNameDecorator.printName();
            System.out.print("\t\t\t");
            if(flag==5){
                flag=0;
                System.out.println();
            }
        }
        System.out.println("背包中共有武器：" + weaponBag.size() + "件");
    }
    public static boolean triggerBaodi(){
        return drawedNum==baodiNum;
    }
}
