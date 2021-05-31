package JAVA常量;

/*
JAVA常量
常量：是指在JAVA中运行期间固定不变的量
1.字符串常量：凡是用双引号引起来的部分，叫做字符串常量,例如"abc"
2.整数常量:直接写上的数字，没有小数点。例如：100，200
3.浮点数常量：直接写上的数字，有小数点
4.字符常量：凡是用单引号引起来的单个字符（单引号中有且只有一个量）。例如：'A'
5.布尔常量：true, false 只有两种结果
6.空常量：null，没有任何数据

*/

public class Demo01Const{
    public static void main(String[] args) {
        // 字符串常量
        System.out.println("ABC");
        System.out.println("");  // 字符串两个引号中间的内容为空
        System.out.println("xyz");

        // 整数常量
        System.out.println("30");

        // 浮点数常量
        System.out.println("3.14");

        // 字符常量
        System.out.println('A');
        System.out.println('6');  // 两个单引号中间必须有且仅有一个数据，不能为空

        // 布尔常量
        System.out.println(true);
        System.out.println(false);

        // 空常量，不能直接打印输出
        // System.out.println("");
    }
}

