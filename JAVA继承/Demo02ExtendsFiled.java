package JAVA继承;

/*
区分子类方法中重名的三种方法：
1.局部变量：直接写变量名
2.本类变量：this.成员变量名
3.父类变量：super.成员变量名
 */
public class Demo02ExtendsFiled {
    public static void main(String[] args) {
        Z z = new Z();
        z.method();
    }
}
