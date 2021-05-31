package JAVAScanner和API使用;

import java.util.Random;
/*
Random类用来生成随机数字，使用也是三个步骤
1.导包: import java.util.Random;
2.创建: Random r = new Random();
3.使用
获取一个Int数字（范围是int所有范围，有正负两种）
int num = r.nextInt();

获一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(10)
代表的含义是，[0,10) 也就是0-9的范围
 */
public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random(); // 创建了一个随机数对象
        int num = r.nextInt();  // 获取随机数
        System.out.println("随机数是:" + num);


    }


}
