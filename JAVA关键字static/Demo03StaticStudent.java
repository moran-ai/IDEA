package JAVA关键字static;

import JAVA面向对象.封装性.Stu;

public class Demo03StaticStudent {
    public static void main(String[] args) {
        // 首先设置教室，这是静态变量，直接通过类名称进行调用
        Student.room = "101教室";

        Student one = new Student("赵韩樱子", 20);
        System.out.println("one的姓名：" + one.getname());
        System.out.println("one的年龄：" + one.getAge());
        System.out.println("one的教室：" + Student.room);
        System.out.println("===========================");
        Student two = new Student("桥本有菜", 23);
        System.out.println("two的姓名：" + two.getname());
        System.out.println("two的年龄：" + two.getAge());
        System.out.println("two的教室：" + Student.room);
    }
}
