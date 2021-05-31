package JAVA继承.this关键字;

/*
super关键字用来访问父类，this关键字用来访问本类内容，用法有三种:
1.在本类的成员方法中，访问本类的成员变量
2.在本类的成员方法中，访问本类的另一个成员方法
3.在本类的构造方法中，访问本类的另一个构造方法
在访问构造方法时，this()调用也必须是构造方法的第一个语句,唯一一个
super和this两种构造调用，不能同时使用.
 */
public class Zi extends Fu {
    int num = 20;

    public Zi(){
        this(12);  // 本类的无参构造调用本类的有参构造
    }

    public Zi(int num){

    }

    public void showNum(){
        int num = 10;
        System.out.println(num);  // 局部变量
        System.out.println(this.num);  // 本类中的成员变量
        System.out.println(super.num);  // 父类中的成员变量
    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
