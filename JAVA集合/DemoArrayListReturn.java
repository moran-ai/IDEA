package JAVA集合;


import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合存入20个随机数字，然后筛选其中的偶数，并存入到小集合中
 */
public class DemoArrayListReturn {
    public static void main(String[] args) {
        // 创建大集合
        ArrayList<Integer> list = new ArrayList<>();

        // 创建随机数
        Random ran = new Random();

        // for循环随机生成20个随机数字
        for (int i = 0; i < 20; i++) {
            int num = ran.nextInt(101);
            list.add(num);
        }

        ArrayReturn(list);
    }

    // 用来筛选大集合中的偶数,并存入小集合
    public static ArrayList<Integer> ArrayReturn(ArrayList<Integer> list){
        ArrayList<Integer> a = new ArrayList<>();  // 创建一个小集合
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0){
                a.add(num);
            }
        }

        System.out.println("小集合中的偶数个数有：" + a.size() + "个！");
        // 遍历集合a
        for (int i = 0; i < a.size(); i++) {
            System.out.println("小集合中的第" + i +"个偶数元素是：" + a.get(i));
        }

        return a;
    }

}
