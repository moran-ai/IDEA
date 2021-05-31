package JAVA变量;

public class Demo03VariableNotice{
    public static void main(String[] args){
        int num1 = 10; // 创建了一个变量，名叫num1
//        int num1 = 20; // 又创建了一个变量，名字也叫num1,这是错误的写法

        int num2 = 20;

        int num3;
        num3 = 30;
//        System.out.println(num2);

//        System.out.println(num6); // 在创建变量之前，不能使用这个变量

        int num5 = 500;
        System.out.println(num5);

        // 作用域开始
        {
            int num6 = 60;
            System.out.println(num6);
        }
        // 作用域结束
        // 超出了范围，变量不能直接使用

        //int a = 10;
        //int b = 20;
        //int c = 30;
        // 同时创建了三个全都是int类型的变量
        int a,b,c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 同时创建三个int变量，并同时赋值
        int x = 100, y = 200, z = 300;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
