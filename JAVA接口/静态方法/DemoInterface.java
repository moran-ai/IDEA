package JAVA接口.静态方法;

/*
注意：不能通过接口当中的实现类的对象来调用接口中的静态方法
正确用法：直接通过接口名称，调用其中的静态方法
格式：
    接口名称.静态方法();
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 直接通过接口类调用静态方法
        MyInterfaceStatic.methodStatic();
    }
}
