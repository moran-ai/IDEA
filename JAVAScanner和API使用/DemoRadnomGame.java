package JAVAScanner和API使用;

import java.util.Random;
import java.util.Scanner;

/*
1.首先随机产生一个随机数字，并且一个数字产生后不再变化
2.需要键盘输入
3.获取键盘输入的数字
4.已经得到了两个数字，一个是随机数，一个输入数字,进行判断
 5.重试就是再来一遍
 */
public class DemoRadnomGame {
    public DemoRadnomGame() {
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);  // 创建一个键盘输入的对象
        Random r = new Random();  // 创建一个随机数对象

        int randomNum = r.nextInt(101); // [0-100]的随机数
        int i = 0;  // 计数
        while (true){
            if (i > 6){
                System.out.println("你已经超过次数，你输了！");
                break;
            }
            i++;
            System.out.println("请输入猜测的数字：");
            int guessnum = n.nextInt();  // 进行键盘输入

            if (guessnum > randomNum){
                System.out.println("太大了，小一点！");
            } else if (guessnum < randomNum){
                System.out.println("太小了，大一点！");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("共猜了" + i +"次！");
                break; // 猜中了，游戏结束
            }
        }
        System.out.println("游戏结束！");
    }
}
