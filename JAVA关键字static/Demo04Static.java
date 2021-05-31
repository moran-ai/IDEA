package JAVA关键字static;

import JAVA面向对象.封装性.Per;

/*
静态代码块的格式：
    public class 类名称{
        static{
            // 静态代码块的内容
        }
    }
特点：当第一次用到本类时，静态代码块执行唯一的一次
静态内容总是优先于非静态，静态内容比构造方法先执行

静态代码块的典形用途：
用来一次性的对静态成员变量进行赋值。
 */
public class Demo04Static {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person();
    }
}
