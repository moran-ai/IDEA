package 复习.集合;

import java.util.ArrayList;
import java.util.Random;

public class recall_ArrayList {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<Integer> list = new ArrayList<>();

        // 创建Random对象
        Random ran = new Random();

        // 随机生成10个1-33之间的随机整数
        for(int i = 0; i < 10; i++){
            int a = ran.nextInt(34);
            list.add(a);
           // System.out.println(a);
        }
        System.out.println(list);

        // 遍历集合,取出里面的偶数
        for(int i = 0; i < list.size(); i++){
            int b = list.get(i);
            if(b % 2 ==0){
                System.out.println(b);
            }
        }

    }
}
