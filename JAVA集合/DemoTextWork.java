package JAVA集合;

import java.util.ArrayList;
import java.util.Random;

public class DemoTextWork {
    public static void main(String[] args) {
        // 创建一个整数集合
        ArrayList<Integer> list = new ArrayList<>();

        // 创建一个随机数对象
        Random ran = new Random();

        // 随机生成10个随机整数
        for (int i = 0; i < 10; i++) {
            int num = ran.nextInt(34);  // 随机数生成的范围在1-33之间
            list.add(num);
        }
        int a = 0;
        for (int i = 0; i < list.size(); i++) {
            a++;
            System.out.println("list中的元素有："+list.get(i) + " 这是第"+a+"个元素！");
        }
    }


}
