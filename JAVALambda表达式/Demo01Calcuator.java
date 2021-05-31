package JAVALambda表达式;

import java.util.Calendar;

/*
lambda表达式有参数有返回值的练习
    需求：
        给定一个Calcuator计算器接口，内含抽象方法calc可以将两个int数字相加得到和
        使用lambda表达式调用invokeCalc()方法，完成120和130相加的值
 */
public class Demo01Calcuator {
    public static void main(String[] args) {
        // 调用invokeCalc方法,参数是一个接口,使用匿名内部类
        invokeCalc(10, 20, new Calcuator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        // 使用lambda表达式简化代码
        invokeCalc(120, 130,(int a, int b) ->{
            return a + b;
        });

        // (参数列表):括号中参数列表的数据类型，可以省略不写
//        {重写接口方法的代码}:如果{}中的代码只有一行。无论是否有返回值，都可以省略({},return,分号)
//        注意事项：
//        {},return,分号必须一起省略
        invokeCalc(120, 130,(a,  b) -> a + b);

    }
    /*
    定义一个方法
    传递两个int类型的整数
    传递Calcuator接口
    方法内部调用Calendar中的方法
     */
    public static void invokeCalc(int a, int b, Calcuator c){
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
