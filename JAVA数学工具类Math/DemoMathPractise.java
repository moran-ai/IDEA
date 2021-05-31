package JAVA数学工具类Math;

/*
题目：
    计算-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个

分析：
    1.确定了范围，使用for循环
    2.起点位置，-10.8应该转换为-10,两种方法：
        2.1 Math.ceil() 向上取整：-10
        2.2 强制转换为int ,会自动舍取所有小数位
    3.步进表达式：num++;
    4.绝对值：Math.abs()
    5.计数器进行统计++

备注：如果使用Math.ceil()方法，-10.8变成-10.0，double也是可以进行++的
 */
public class DemoMathPractise {
    public static void main(String[] args) {
        int count = 0; // 计数器

        double min = -10.8;
        double max = 5.9;
        // 这样处理，变量i就是整数
        for (int i = (int) min; i < max; i++){
            int abs = Math.abs(i); // 绝对值
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("符合要求的整数共有：" + count + "个！");

        int num = 0;
        for (double i = Math.ceil(min); i < max; i++){
            double abs = Math.abs(i);
            if (abs > 6 || abs < 2.1){
                System.out.println(i);
                num++;
            }
        }
        System.out.println("共有：" + num + "个！");
    }
}
