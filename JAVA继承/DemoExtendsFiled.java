package JAVA继承;

// 继承中的成员变量访问特点
/*
在子类和父类的继承关系中，如果成员变量重名，创建子类时有两种访问方式：
1.直接：直接通过子类对象访问成员变量
    规则：等号左边是谁，就优先用谁，没有则向上找
2.间接：间接通过成员方法访问成员变量
    规则：该方法属于谁，优先使用谁，没有向上找.
 */
public class DemoExtendsFiled {
    public static void main(String[] args) {
        // 创建一个父类对象
        Fu fu = new Fu();
        System.out.println(fu.numFu); // 父类只能使用父类的内容，不能使用子类的内容
        System.out.println("================");

        Zi zi = new Zi();  // 子类既可以使用父类的内容，也可以使用子类的内容
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("=================");

        // 等号左边是谁，就优先用谁（直接访问）
        System.out.println(zi.num); // 优先子类

        // 间接访问
        // 这个方法是子类的，优先使用子类，没有则使用父类
        zi.methodZi();

        // 这个方法是父类的
        zi.mehtodFu();
    }
}
