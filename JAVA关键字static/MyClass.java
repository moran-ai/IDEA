package JAVA关键字static;

public class MyClass {
    int num;  // 成员变量
    static int number;  // 静态变量

    // 成员方法
    public void method(){
        System.out.println("这是一个成员方法");
        System.out.println(num);  // 成员方法可以访问成员变量
        System.out.println(number); // 成员方法可以访问静态变量
    }

    // 静态方法
    public static void methodStatic(){
        System.out.println("这是一个静态方法");
        System.out.println(number); // 静态方法可以访问静态变量
        //System.out.println(num); // 静态方法不可以直接访问非静态变量
    }
}
