package JAVA内部类.概念与分类.成员内部类的同名变量访问;

public class DemoInnerClass {
    public static void main(String[] args) {
        // 创建内部类对象
        Outer.Ineer ineer = new Outer().new Ineer();

        // 使用内部类方法
        ineer.methodInner();  // 访问外部类的成员变量
    }
}
