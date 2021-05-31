package JAVA继承;

public class Z extends F {
    int num = 10;

    public void method(){
        int num = 3;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 本类的成员变量
        System.out.println(super.num); // 父类的成员变量
    }
}
