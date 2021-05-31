package JAVA面向对象;

/*
定义一个类，用来模拟学生事物，其中就有两个组成部分：
    1.属性（是什么） 姓名、年龄、....等
    2.行为（能做什么）吃、睡、学习...等

对应到java类中：
    1.成员变量: String name(姓名); int age(年龄);
    2.成员方法: public void eat(){} //  吃饭
                public void sleep(){} // 睡觉
                public void study(){} // 学习

注意事项：
    1.成员变量直接定义在类中，在成员方法外面
    2.成员方法不需要static关键字
*/
public class Students {
    // 成员变量
    String name; // 姓名
    int age;   // 年龄

    // 成员方法
    public void eat(){
        System.out.println("吃");
    }

    public void sleep(){
        System.out.println("睡");
    }

    public void study(){
        System.out.println("学习");
    }
}
