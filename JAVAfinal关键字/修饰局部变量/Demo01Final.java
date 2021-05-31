package JAVAfinal关键字.修饰局部变量;

/*
final关键字代表最后，不可变
四种用法：
    1.修饰类
    2.修饰方法
    3.修饰局部变量
    4.修饰成员变量
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);

        // 使用final关键字修饰局部变量时，变量不能进行改变
        final int num1 = 30;
        System.out.println(num1);

        /*
        对于基本数据类型，不可变是指变量当中的数据不可变
        对于引用数据类型，不可变是指变量当中的地址值不可变
         */
    }
}
