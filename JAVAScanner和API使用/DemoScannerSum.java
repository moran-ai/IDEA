package JAVAScanner和API使用;


import java.util.Scanner;

/*
键盘输入两个int数字，并且求和
 */
public class DemoScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a  = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();

        int num = a + b;
        System.out.println("结果是：" + num);
    }
}
