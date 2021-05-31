package JAVA集合;

/*
生成6个1-33之间的随机整数，添加到集合，并进行遍历集合
 */

import java.util.ArrayList;
import java.util.Random;

public class DemoArryListRandom {
    public static void main(String[] args) {
        // 创建一个集合
        ArrayList<Integer> list = new ArrayList<>();

        // for循环生成6个随机整数
        for (int i = 0; i < 6; i++) {
            // 生成随机整数
            Random a = new Random();
            int num = a.nextInt(34);  // 取值范围是1-33之间
            list.add(num);
        }

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
