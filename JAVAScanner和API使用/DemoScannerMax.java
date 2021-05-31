package JAVAScanner和API使用;

import java.util.Scanner;

public class DemoScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextByte();
        if (a > b && a > c){
            System.out.println("最大值是：" + a);
        } else if(b>a && b>c){
                System.out.println("最大值是：" + b);
            } else {
            System.out.println("最大值是：" + c);
        }
    }
}
