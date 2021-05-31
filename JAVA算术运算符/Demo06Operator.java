package JAVA算术运算符;

/*
自增自减运算符
自增运算符： ++
自减运算符： --
含义：让一个变量涨一个数字，或者让一个变量降一个数字
格式：写在变量名称之前，或者写在变量名称之后 例如： ++num ，也可以num++
使用方式:
	1.单独使用：不和其他任何操作混合，自己独立成一个步骤
	2.混合使用：和其他操作混合，例如与赋值混合，或者与打印操作混合，等。
使用区别：
	1.在单独使用时候，前++和后++没有任何区别，也就是:++num;和num++;是完全一样的.
	2.在混和使用时，有【重大区别】
		A.如果是【前++】，那么变量【立刻马上+1】，然后拿着结果使用。【先加后用】
		B.如果是【后++】，那么首先使用变量原来的值，【然后再让变量+1】。【先用后加】
注意事项：
	只有变量才能使用自增、自减运算，常量不可以变，所有不能用

*/
public class Demo06Operator{
    public static void main(String[] args){
        int num1 = 10;
        System.out.println(num1);  // 输出10

        ++num1;   // 单独使用 前++
        System.out.println(num1); // 输出11

        num1++;   // 单独使用 后++
        System.out.println(num1); // 输出12
        System.out.println("================");

        // 与打印操作混合的时候
        int num2 = 20;
        System.out.println(++num2); //混合使用，先++，变量立马变成21，然后打印出来  输出21
        System.out.println(num2);  // 输出21

        System.out.println("================");

        int num3 = 30;
        System.out.println(num3++); // 混合使用，后+=，先使用变量原来的值30，然后再让变量加1得到31 输出30
        System.out.println(num3);  // 打印31

        System.out.println("================");

        // 赋值操作混合
        int num4 = 40;
        int result1 = --num4; // 混合使用，前-- ,变量立刻马上变成39,然后结果39交给变量result1
        System.out.println(result1);  // 输出39
        System.out.println(num4);  // 输出39

        System.out.println("================");

        int num5 = 50;
        int result2 = num5--;
        System.out.println(result2); // 混合使用,后-- 先把变量原来的值50赋值给result2,然后将变量的值减去1的得到49 输出50
        System.out.println(num5); // 输出 49
        System.out.println("================");

        int x = 10;
        int y = 20;
        int result3 = ++x + y--;
        // x+y --> 11 + 20 --> 31
        System.out.println(result3);  // 输出31
        System.out.println(x);    // 输出11 先++，先将x原来的值加1得到11，然后再进行运算
        System.out.println(y);	  // 输出19 后--,先使用y原来的值20进行运算，运算完后然后减去1得到19
    }
}
