package JAVA接口;

/*
接口就是多个类的公共规范
接口是一种引用数据类型,最重要的是抽象方法
定义格式：
    public interface 接口名称{
        // 接口内容
    }

备注：换成了关键字interface后，编译后的字节码文件仍然是.java-->.class

如果是java7,接口包含的内容有：
1.常量
2.抽象方法

如果是java8，接口包含的内容有：
3.默认方法
4.静态方法

如果是java9,接口包含的内容有：
5.私有方法

接口使用步骤：
    1.接口不能直接使用：必须有一个实现类来实现接口
    格式：
        public class 实现类名称 implements 接口类名称{

        }
    2.接口的实现类必须覆盖重写接口中的所有抽象方法,去掉abstract关键字，加上大括号
    3.创建实现类的对象

注意：
    如果实现类并没有重写接口类中的所有抽象方法，那么实现类就必须是抽象类
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 创建实现类的对象
        MyInterfaceAbstractImpl myInterfaceAbstract = new MyInterfaceAbstractImpl();
        myInterfaceAbstract.methodAbs();
        myInterfaceAbstract.methodAbs1();
        myInterfaceAbstract.methodAbs2();
    }
}
