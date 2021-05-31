package 复习;

import java.util.Random;
import java.util.Scanner;

public class recall_while {
    public static void main(String[] args){
        // 创建一个随机数对象
        Random ran = new Random();

        // 创建一个键盘输入对象
        Scanner sca = new Scanner(System.in);

        int num = ran.nextInt(101); // 0-100之间的随机数
        int i = 0;  // 计数
        while (true) {
            if (i > 6){
                System.out.println("很遗憾，你输了！");
                break;
            }
            i++;
            System.out.println("请输入猜的数字：");
            int n = sca.nextInt();

            if (n > num){
                System.out.println("太大了，再小一点！");
            } else if (n < num){
                System.out.println("太小了，再大一点！");
            } else {
                System.out.println("恭喜你，猜对了！！！");
                System.out.println("共猜了" + i + "次！");
                break;
            }
        }
        System.out.println("游戏结束！");
    }
}
