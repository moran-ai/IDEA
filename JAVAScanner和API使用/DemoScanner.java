package JAVAScanner和API使用;
import java.util.Scanner;  // 导包
/*
Scanner类的功能：键盘输入

引用类型的一般使用步骤：
        1.导包: import 包路径.类名称;
        如果需要使用的目标类，和当前类在同一个包下，可以省略导包语句
        只有java.lang包下的内容不需要导包，其他的包都需要import语句
        2.创建:类名称 对象名 = new 类名称()
        3.使用:对象名.成员方法()
 */

// 获取键盘输入的Int数字:int 对象名 = 对象名.nextInt();
// 获取键盘输入的字符串：String 对象名 = 对象名.next();
public class DemoScanner {
    public static void main(String[] args) {
         // 创建
        // System.in 代表从键盘输入
        // 创建一个sc对象
        Scanner sc = new Scanner(System.in);

        // 获取键盘输入的int数字
//        int num = sc.nextInt();
//        System.out.println("输入的int数字是：" + num);

        // 获取输入的字符串
        String str = sc.next();
        System.out.println("输入的字符串是：" + str);
    }
}
