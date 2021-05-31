package JAVA方法;

/*
定义一个方法：求出两个数之和. 有返回值
定义一个方法，打印两个数之和，无返回值

注意事项：
    1.对于有返回值的方法，可以使用单独调用，打印调用和赋值调用
    2.对于无返回值的方法，只能使用单独调用，不能使用打印调用和赋值调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        // main方法调用
        // 调用进行计算，算完之后，将结果告诉num变量
        int num = getSum(10, 20);
        System.out.println("返回值是：" + num);
        System.out.println("==========");

        // 对于void没有返回值的方法，只能单独调用，不能打印和赋值调用
        printSum(100, 200);

    }

    // 两个数相加的方法，有返回值int,谁调用返回值，就把结果告诉谁
    public static int getSum(int a, int b){
        int result = a + b;
        return result;
    }

    // 打印两个数之和
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("结果是：" + result);
    }
}
