package JAVA内部类.概念与分类.匿名内部类;

/*
如果接口的实现类（父类的子类）只需要使用唯一的一次，
那么这种情况下就可以省略该类的定义，使用匿名内部类

匿名内部类的定义格式：
    接口名称 对象名 = new 接口名称(){
        // 覆盖重写所有的抽象方法
    };

对 "new 接口名称(){...};格式解析":
    1.new 代表创建对象的动作
    2.接口名称代表匿名内部类需要实现那个接口
    3.{...}; 匿名内部类的内容

注意：
    1.匿名内部类，在使用时只能创建唯一的一次
    如果需要多次使用，只能通过实现类
    2.匿名对象在调用方法时，只能调用唯一一次
    如果需要多次调用方法，必须给对象命名
    3.匿名内部类省略了【实现类或子类】，匿名对象省略了【对象名称】
    匿名内部类和匿名对象不是一回事
 */

public class DemoMian {
    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterfaceImpl();
//        myInterface.method();

        // 使用匿名内部类 ,不是匿名对象，对象名是myInterface
        MyInterface myInterface = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现方法111");
            }

            @Override
            public void method2(){
                System.out.println("匿名内部类实现方法222");
            }
        };
        myInterface.method1();
        myInterface.method2();
        System.out.println("===================");

        // 使用匿名对象和匿名内部类
        new MyInterface(){
            @Override
            public void method1() {
                System.out.println("匿名内部类实现方法1111");
            }

            @Override
            public void method2(){
                System.out.println("匿名内部类实现方法2222");
            }
        }.method1();
    }
}
