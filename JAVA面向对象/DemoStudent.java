package JAVA面向对象;


/*
通常情况下，一个类不能直接使用，需要根据类创建一个对象，才能使用
1.导包:指出需要使用的类在什么位置
    import 包名称.类名称;
    import package JAVA面向对象.Students;
    对于和当前类属于用一个目录的情况下，可以省略导包语句
2.创建
    类名称 对象名 = new 类名称()
    Students stu = new Students();
3.使用,分为两种情况
    1.使用成员变量：对象名.成员变量名
    2.使用成员方法: 对象名.成员方法名(参数)
    想用谁，就调用谁

注意事项:
    1.如果成员变量没有进行赋值，那么将会有一个默认值,规则和数组一样
    2.
 */
public class DemoStudent {
    public static void main(String[] args) {
        // 1.导包
        // 需要使用的Students类，和DemoStudent处于同一包下，可以省略导包语句

        // 2.根据Students这个类，创建了stu这个对象
        // 创建的格式: 类名称 对象名 = new 类名称();
        Students stu = new Students();

        // 3.使用
        // 1.使用成员变量的格式：对象名.成员变量名;
        // 2.使用成员方法的格式：对象名.成员方法;
        System.out.println(stu.name);  // 输出null
        System.out.println(stu.age);   // 输出0
        System.out.println("======");
        // 给成员变量赋值
        stu.name = "小明";
        stu.age = 23;
        System.out.println(stu.age);
        System.out.println(stu.name);
        System.out.println("========");

        // 使用成员方法
        // 格式：对象名.方法名()
        stu.eat();
        stu.sleep();
        stu.study();
    }

}
