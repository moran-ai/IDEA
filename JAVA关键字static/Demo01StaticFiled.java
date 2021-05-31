package JAVA关键字static;

import JAVA面向对象.封装性.Stu;

public class Demo01StaticFiled {
    public static void main(String[] args) {
        Student stu = new Student("黄蓉", 19);
        Student s = new Student("3", 12);
        stu.room = "101教室";
        //Student.room = "10";
        System.out.println("姓名：" + stu.getname() + ", "+"年龄："
                + stu.getAge() + ", "+ "教室："+stu.room + ", " + "学号："+stu.getId());
        System.out.println("姓名：" + s.getname() + ", "+"年龄："
                + s.getAge() + ", "+"教室："+stu.room + ", " + "学号："+s.getId());

    }
}
