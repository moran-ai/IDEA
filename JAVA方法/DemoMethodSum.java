package JAVA方法;

/*
定义一个方法：用来求出1-100之间所有数字的和
 */
public class DemoMethodSum {
    public static void main(String[] args) {
        System.out.println("结果是:" + getSum());
        System.out.println("===========");
        System.out.println("结果是：" + Sum());
    }

    /*
    三要素：
    1.返回值 :  有返回值 计算结果是一个int
    2.方法名称： getSum
    3.参数列表: (1-100)数据范围已经确定，不需要参数
     */

    // 定义1-100之间所有数的和
    public static int getSum(){
        int sum = 0; // 用来接收结果的变量
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // 计算1-100之间所有偶数的和
    public static int Sum(){
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                num += i;
            }
        } return num;
    }
}
