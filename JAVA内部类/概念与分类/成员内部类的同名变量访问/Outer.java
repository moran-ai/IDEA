package JAVA内部类.概念与分类.成员内部类的同名变量访问;

/*
外部类与内部类成员变量出现重名的情况，如何访问外部类成员变量：
格式：
    外部类名称.this.外部类成员变量名
 */
public class Outer {
    int num = 10;

    public class Ineer{
        int num = 20;

        public void methodInner(){
            int num = 30; // 内部类方法的局部变量
            System.out.println(num); // 局部变量 30
            System.out.println(this.num);  // 20
            System.out.println(Outer.this.num); // 10  外部类的成员变量
        }
    }
}
