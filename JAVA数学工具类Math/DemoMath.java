package JAVA数学工具类Math;

/*
java.lang.Math:是与数学相关的工具类，里面提供了大量的静态方法，完成与数学相关的操作

方法：
public static double abs(double num):取绝对值,有多种重载
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入
Math.PI代表近似的圆周率常量(double类型)
 */
public class DemoMath {
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(2.3));
        System.out.println(Math.abs(-1));
        System.out.println(Math.abs(0));
        System.out.println("================");

        // 向上取整
        System.out.println(Math.ceil(3.9));  // 4.0
        System.out.println(Math.ceil(3.1));  // 4.0
        System.out.println(Math.ceil(3.0));  // 3.0
        System.out.println("================");

        // 向下取整
        System.out.println(Math.floor(4.0));  // 4.0
        System.out.println(Math.floor(4.3));    // 4.0
        System.out.println(Math.floor(4.4));    // 4.0
        System.out.println(Math.floor(3.54));   // 3.0
        System.out.println("===================");

        // 四舍五入
        System.out.println(Math.round(3.5)); // 4
        System.out.println(Math.round(3.1)); // 3

    }
}
