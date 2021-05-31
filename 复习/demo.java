package 复习;

import java.util.ArrayList;
import java.util.Random;

public class demo {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        fangf();
        randoma();
        jihe();
    }

    // 创建一个为fangf的方法
    public static void fangf(){
        int a = 4;
        int b = 5;
        int c = 6;
        int d = a+b+c;
        System.out.println(d);
        System.out.println("============");
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }
    }

    // 创建一个生成随机数的方法
    public static void randoma(){
        Random t = new Random();
        int a = t.nextInt();
        System.out.println("生成的随机数是：" + a);
    }

    // 创建一个集合的方法
    public static void jihe(){
        ArrayList<Integer> list = new ArrayList<>();
        // 集合中添加数据
        list.add(1);
        list.add(2);
        list.add(3);

        // 集合中取出数据
        int num = list.get(2);
        System.out.println("取出来的数字是：" + num);
        System.out.println("==============");
        // 集合中删除数据
        int a = list.remove(1);
        System.out.println("删除的数字是：" + a);

    }

}
