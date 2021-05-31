package JAVA接口.注意事项及特点;

import JAVA继承.Z;

/*
使用接口的注意事项：
1.接口是没有静态代码块或者构造方法的
2.一个类的直接父类是唯一的，但是一个父类可以实现多个接口
格式：
    public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
        // 覆盖重写所有的抽象方法
        }
3.如果实现类所实现的多个接口中，存在重复的抽象方法，只需要覆盖重写一次即可
4.如果实现类没有覆盖重写所有接口当中的抽象方法，那么实现类就必须是一个抽象类
5.如果实现类所实现的多个接口中，存在重复的默认方法，实现类要对冲突的默认方法进行覆盖重写
6.一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法
继承优先于接口

 */
public class DemoInterface implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA(){
        System.out.println("覆盖重写A方法");
    }

    @Override
    public void methodB(){
        System.out.println("覆盖重写B方法");
    }

    @Override
    public void methodAbs(){
        System.out.println("覆盖重写了重复的抽象方法");
    }

    @Override
    public void method(){

    }

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.method();
    }
}
