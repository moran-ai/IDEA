package JAVA抽象;

/*
抽象方法：直接加上abstract关键字，去掉大括号，直接分号结束
抽象类：抽象方法所在的类，必须是抽象类。在class之前写上abstract

如何使用抽象类，抽象方法
    1.不能直接创建抽象类对象
    2.必须用一个子类来继承抽象父类
    3.子类必须覆盖重写父类中的所有抽象方法
    覆盖重写（实现）：子类去掉抽象方法的abstract关键字，然后补上方法体大括号
    4.创建子类对象使用

 */
// 抽象类
public abstract class Animal {
    // 抽象方法,代表吃，具体吃什么不确定
    public abstract void eat();

    // 普通成员方法
    public void normalMethod(){

    }
}
