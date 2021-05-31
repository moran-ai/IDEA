package JAVA变量;

public class Demo02Variable{
    public static void main(String[] args){
        // 创建一个变量
        // 格式：数据类型 变量名称
        int num1;
        // 向变量中存入一个数据
        //格式：变量名称=数据值
        num1 = 10;
        // 当打印输出变量名称时，输出的是变量内容
        System.out.println(num1);  // 输出10

        // 改变变量的值
        num1 = 20;
        System.out.println(num1);  // 输出20

        // 使用一步到位的格式来定义变量
        // 数据类型 变量名称 = 数据值 ;
        int num2 = 30;
        System.out.println(num2);

        // 改变变量的值
        num2 = 35;
        System.out.println(num2);
        System.out.println("==============");

        byte num3 = 30; // 注意：右侧数值的范围不能超过左侧的数据范围,否则错误
        System.out.println(num3);

        short num5 = 54;
        System.out.println(num5); // 输出50

        long num6 = 3000000000L;
        System.out.println(num6);

        float num7 = 2.5F;
        System.out.println(num7); // 输出2.5

        double num8 = 1.2;
        System.out.println(num8);  // 输出1.2

        char ziful = 'A';
        System.out.println(ziful); // 输出A

        ziful = '中';
        System.out.println(ziful);

        boolean var1 = true;
        System.out.println(var1); // true

        var1 = false;
        System.out.println(var1);

        // 将一个变量的数据内容，赋值交给另一个变量
        // 右侧的变量名称var1已经存在，里面是false
        // 将右侧的false赋值给vr2并存储
        boolean var2 = var1;
        System.out.println(var2); // 输出false
    }
}
