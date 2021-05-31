package JAVA继承.重写;

/*
继承关系中，父子类构造方法访问特点：
    1.子类当中有一个默认隐含的super()调用,所以先执行父类，后执行子类
    2.子类构造可以通过super关键字来调用父类重载构造
    3.super()的父类调用，必须是子类构造方法的第一个语句.不能一个子类构造调用多次super构造

总结：
    子类必须调用父类的构造方法，不写则赠送super(),super()只能有一个,还必须是第一个
 */
public class DemoConstrutor {
    public static void main(String[] args) {
        Zz z = new Zz();

    }
}
