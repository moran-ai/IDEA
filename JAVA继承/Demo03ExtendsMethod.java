package JAVA继承;

// 继承中成员方法的访问特点
/*
在父子类的继承关系中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先使用谁,没有向上找

注意：
    无论是成员变量还是成员方法，如果没有向上找父类，不会向下找子类

重写（Override）
概念：在继承关系中，方法的名称一样，参数列表也一样

重写（Override）: 方法的名称一样，参数列表【也一样】 覆盖，覆写
重载（Overload）: 方法的名称一样，参数列表【不一样】

方法覆盖重写的特点：创建的是子类对象，就优先使用子类方法.

 */
public class Demo03ExtendsMethod {
    public static void main(String[] args) {
        ZiLei ziLei = new ZiLei();
        ziLei.methodZiLie();
        ziLei.methodFuLei();
        ziLei.method();
    }
}
