package JAVA运算符;

/*
赋值运算符分为：
	1.基本运算符：就是一个等号“=”，代表将右侧的数据交给左侧的变量
	             例如：int a = 3;
	2.复合运算符：
		+=     a += 1    相当于a = a + 1
		-=	   b -= 2    相当于b = b - 2
		*=     c *= 3    相当于c = c * 3
		/=     d /= 4    相当于d = d / 4
		%=     e %= 5    相当于e = e % 5
注意事项：
	1.只有变量才能使用赋值运算符，常量不能进行赋值,常量不能写在赋值运算符的左边
	2.复合赋值运算符其中隐含了一个强制类型转换
*/
public class Demo07Opeator{
    public static void main(String[] args){
        int a = 10;
        a += 5;   // 按照公式进行翻译： a = a + 5
        System.out.println(a);  // 输出15

        int x = 10;
        x %= 3;  // x = x % 3 取余数
        System.out.println(x);  // 输出1

        // 强制类型转换
        byte num = 30;
        num += 5;  // num = num + 5
        // num = num + int
        // num = int + int
        // num = int
        // num = (byte) int
        System.out.println(num);
    }
}
