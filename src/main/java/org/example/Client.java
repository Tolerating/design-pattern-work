package org.example;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }
}

class MainMenu {
    private Scanner scanner;
    private boolean exit;
    private DrawCardFaceade changzhu = new DrawCardFaceade("五星:刘凯的世界之剑",1);
    private DrawCardFaceade xianshi = new DrawCardFaceade("五星：贯虹之槊",2);

    public MainMenu() {
        this.scanner = new Scanner(System.in);
        this.exit = false;
    }
    public void displayMenu() {
        SubMenu subMenu = new SubMenu();
        while (!exit) {
            System.out.println("\n原神游戏抽卡系统:");
            System.out.println("抽卡介绍:抽卡有单抽和10连，4星概率10%，5星概率2%，10连必出4星，抽60次必出UP五星");
            System.out.println("1. 神铸赋形：限时UP \033[33m五星：刘凯的世界之剑\033[0m\n\t" +
                    "其余五星：\033[33m天空之刃,风鹰剑，天空之傲天空之刃，风鹰剑，天空之傲，狼的末路，天空之翼，阿莫斯之弓，和璞鸢，天空之脊，天空之卷\033[0m");
            System.out.println("2. 神铸赋形：限时UP \033[33m五星：贯虹之槊\033[0m\n\t" +
                    "其余五星：\033[33m天空之刃,风鹰剑，天空之傲天空之刃，风鹰剑，天空之傲，狼的末路，天空之翼，阿莫斯之弓，和璞鸢，天空之脊，天空之卷\033[0m");
            System.out.println("3. 查看背包");
            System.out.println("0. 退出");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    System.out.println("神铸赋形：限时UP \033[33m五星：刘凯的世界之剑\033[0m");
                    subMenu.displaySubMenu(changzhu);
                    break;
                case 2:
                    System.out.println("神铸赋形：限时UP \033[33m五星：贯虹之槊\033[0m");
                    subMenu.displaySubMenu(xianshi);
                    break;
                case 3:
                    System.out.println("背包中的物品");
                    if(Common93.weaponBag.size()==0){
                        System.out.println("背包空空如也！！");
                    }else {
                        Common93.showBag();
                    }
                    break;
                case 0:
                    exit = true;
                    System.out.println("退出抽卡系统！");
                    break;
                default:
                    System.out.println("无效的选择。请输入合法的选项。");
            }
        }
        scanner.close();
    }

    private int getUserChoice() {
        System.out.print("输入你的选择: ");
        while (!scanner.hasNextInt()) {
            System.out.println("无效输入，请输入一个数字。");
            scanner.next();
        }
        System.out.println("");
        return scanner.nextInt();
    }
}

class SubMenu {
    private Scanner scanner;
    public SubMenu() {this.scanner = new Scanner(System.in);}
    public void displaySubMenu(DrawCardFaceade faceade) {
        boolean backToMainMenu = false;
        while (!backToMainMenu) {
            System.out.println("抽卡选项:");
            System.out.println("1. 单抽");
            System.out.println("2. 十连");
            System.out.println("3. 抽卡历史");
            System.out.println("0. 返回");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    faceade.singleDraw();
                    break;
                case 2:
                    faceade.tenDraw();
                    break;
                case 3:
                    for (Memento93 memento : faceade.getAllMemento()) {
                        for (AbstractDecorator93 decorator93 : memento.getState()) {
                            decorator93.display();
                        }
                    }
                    break;
                case 0:
                    backToMainMenu = true;
                    System.out.println("返回主界面");
                    break;
                default:
                    System.out.println("无效的选择。请输入合法的选项。");
            }
        }
    }
    private int getUserChoice() {
        System.out.print("输入你的选择: ");
        while (!scanner.hasNextInt()) {
            System.out.println("无效输入，请输入一个数字。");
            scanner.next();
        }
//        System.out.println("");
        return scanner.nextInt();
    }
}
