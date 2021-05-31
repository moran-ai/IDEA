package JAVA算术运算符;

/*
四则运算
加 +
减 -
乘 *
除 /
除法公式：
	被除数 / 除数 = 商 .... 余数
	对于一个整数的表达式来说，储法用的是整数，整数除以整数，结果仍是整数。只看商，不看余数
取模(取余数):  %
只有对于整数的除法来说，取模才有余数的意义

注意事项：
	1. 一旦运算当中有不同的数据，那么结果将会是数据类型范围大的那种
*/
public class Demo04Operator{
    public static void main(String[] args){
        // 两个常量之间可以数学运算
        System.out.println(20+30);

        // 两个变量之间也可以数学运算
        int a = 20;
        int b = 30;
        System.out.println(a - b);

        // 变量和常量之间可以混合使用
        System.out.println(a * 10); // 输出200

        int x = 10;
        int y = 3;
        int result1 = x / y;
        System.out.println(result1);

        int result2 = x % y;
        System.out.println(result2); // 取模(余数)，输出1

        // int + double --> double + double --> double
        double result3 = x + 2.5;
        System.out.println(result3);
    }
}
