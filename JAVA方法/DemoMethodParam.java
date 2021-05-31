package JAVA方法;

/*
有参数：小括号中有内容，当一个方法需要一些数据条件,才能完成任务时，就是有参数
    例如两个数字相加，必须知道两个数字各是多少，才能相加
无参数：小括号留空，一个方法不需要任何数据条件，自己就能独立完成任务，就是无参数
 */

public class DemoMethodParam {
    public static void main(String[] args) {
        method1(10, 20);
        method2();
    }

    // 两个数字相乘   有参数
    public static void method1(int a , int b){
        int result = a * b;
        System.out.println("结果是："+result);
    }

    // 打印输出10次文本字符串  无参数
    public static void method2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World！" + i);
        }

    }
}
