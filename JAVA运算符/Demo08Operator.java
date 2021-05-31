package JAVA运算符;

/*
>	大于
<	小于
<=	小于等于
>=	大于等于
!=	不等于
==	等于【两个等号连写才是相等，一个等号是赋值】

注意事项：
	1.比较运算符的结果一定是一个boolean值，成立就是true,不成立就是false
	2.如果进行多次判断，不能连着写
	数学当中的写法，例如: 1<x<3
	程序中【不允许】这种写法
*/
public class Demo08Operator{
    public static void main(String[] args){
        System.out.println(10 > 5);  // 输出true

        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 < num2);
        System.out.println(num2 >= 100);  // 输出false
        System.out.println(num2 <= 100);  // 输出true
        System.out.println(num2 <= 12);   // 输出true
        System.out.println("=============");
        System.out.println(10 == 10);     // 输出true
        System.out.println(20 != 25);     // 输出true
        System.out.println(20 != 20);     // 输出false

        // int x = 2;
        // System.out.println( 1 < x < 3); 错误写法，不能连着写

    }
}
