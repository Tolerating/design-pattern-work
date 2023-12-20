package org.example;
import java.util.Random;
public class Weapon93 {
    public static String[] FivePool1 = new String[]{
            "五星：天空之刃",
            "五星：风鹰剑",
            "五星：天空之傲",
            "五星：狼的末路",
            "五星：天空之翼",
            "五星：阿莫斯之弓",
            "五星：和璞鸢",
            "五星：天空之脊",
            "五星：天空之卷",
            "五星:刘凯的世界之剑"
    };
    public static String[] FivePool2 = new String[]{
            "五星：天空之刃",
            "五星：风鹰剑",
            "五星：天空之傲",
            "五星：狼的末路",
            "五星：天空之翼",
            "五星：阿莫斯之弓",
            "五星：和璞鸢",
            "五星：天空之脊",
            "五星：天空之卷",
            "五星：贯虹之槊"
    };
    public static final String[] Fourth = new String[]{
            "四星：船坞长剑",
            "四星：西福斯的月光",
            "四星：暗巷闪光",
            "四星：匣里龙吟",
            "四星：西风剑",
            "四星：祭礼剑",
            "四星：笛剑",
            "四星：便携动力锯",
            "四星：玛海菈的水色",
            "四星：恶王丸",
            "四星：千岩古剑",
            "四星：西风大剑",
            "四星：钟剑",
            "四星：雨裁",
            "四星：祭礼大剑",
            "四星：测距规",
            "四星：曚云之月",
            "四星：幽夜华尔兹",
            "四星：绝弦",
            "四星：祭礼弓",
            "四星：弓藏",
            "四星：西风猎弓",
            "四星：勘探钻机",
            "四星：断浪长鳍",
            "四星：千岩长枪",
            "四星：西风长枪",
            "四星：匣里灭辰",
            "四星：流浪的晚星",
            "四星：暗巷的酒与诗",
            "四星：昭心",
            "四星：西风秘典",
            "四星：流浪乐章",
            "四星：祭礼残章"
    };
    public static final String[] Three = new String[]{
            "三星：冷刃",
            "三星：黎明神剑",
            "三星：飞天御剑",
            "三星：铁影阔剑",
            "三星：以理服人",
            "三星：沐浴龙血的剑",
            "三星：弹弓",
            "三星：鸦羽弓",
            "三星：神射手之誓",
            "三星：黑缨枪",
            "三星：翡玉法球",
            "三星：讨龙英杰谭",
            "三星：魔导绪论"
    };
    public static String getRandomElement(int flag,int fivePool) {
        Random random = new Random();
        String res = "";
        if(flag==3){
            res = Three[random.nextInt(Three.length)];
        } else if (flag==4) {
            res=Fourth[random.nextInt(Fourth.length)];
        }else{
            if (fivePool==1){
                res=FivePool1[random.nextInt(FivePool1.length)];
            }else{
                res=FivePool2[random.nextInt(FivePool2.length)];
            }
        }
        return res;
    }
}
