package JAVAScanner和API使用;


import java.util.Scanner;

public class Demo01Anonymous {
    public static void main(String[] args) {
       // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();  // 键盘输入

        // 匿名使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        // 使用匿名对象作为参数
       // methodParam(new Scanner(System.in));

        // 使用匿名对象作为返回值
        Scanner src = methodReturn();
        int num = src.nextInt();
        System.out.println("输入的是：" + num);
    }

    // 匿名对象作为参数
    public static void methodParam(Scanner sc){
           int num =  sc.nextInt();
           System.out.println("输入的是：" + num);
    }

    // 匿名对象作为返回值
    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
