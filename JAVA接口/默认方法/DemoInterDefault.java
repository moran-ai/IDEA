package JAVA接口.默认方法;

/*
1.接口的默认方法，可以通过接口实现对象，直接调用
2.接口的默认方法，也可以通过接口实现类覆盖重写
 */
public class DemoInterDefault {
    public static void main(String[] args) {
        MyInterfaceDefaultA A = new MyInterfaceDefaultA();
        MyInterfaceDefaultB B = new MyInterfaceDefaultB();
        A.mehtodAbs();
        A.mehtodAbs2();  // 实现类A覆盖重写接口类中的默认方法
        System.out.println("=====================");
        B.mehtodAbs();
        B.mehtodAbs2();  // 默认方法
    }
}
