package JAVA面向对象.封装性;

/*
一个标准的类，主要由下面四个部分组成：
    1.所有的成员变量都要使用private关键字
    2.为每一个成员变量编写一对get/set方法
    3.编写一个无参数的构造方法
    4.编写一个全参数的构造方法

标准的类也叫Java  Bean
 */
public class Stus {
    private String name;  // 姓名
    private int age;    // 年龄

    public Stus() {
    }

    public Stus(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
