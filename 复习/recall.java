package 复习;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class recall {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
//        Ran();
//        System.out.println("=========");
//        r(2,3);
//        System.out.println("==========");
//        w();
//        System.out.println("==========");
//        wh();
//        System.out.println("==========");
//        s();
        /*
        param(new Scanner(System.in));
        System.out.println("请输入：");
        Scanner sc = Return();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);

         */
//        strl();

       // System.out.println(list.get(2));
        //System.out.println("==================");
//        for (int i = 0; i < list.size(); i++){
//            //System.out.println(i);
//        }
    }

    // 创建一个Ran的方法，作用是生成6个1-10之间的随机数
    // 该方法没有参数，没有返回值
    public static void Ran(){
        Random r = new Random();
        for (int i = 0; i < 6; i++){
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }

    // 创建一个具有参数，具有返回值的方法
    // 定义一个用于计算两个整数之间和的方法
    public static int r(int a, int b){
        int result = a + b;
        System.out.println("计算出的和是：" + result);
        return result; // 返回值的类型要与方法对应, 否则会报错
    }

    // 定义一个方法，用来进行while循环
    public static void w(){
        /*
        while的基本格式：
        初始化语句;
        while (条件判断){
            循环体；
            步进语句;
        }
         */
        int i = 1;
        while ( i <= 10){
            System.out.println("1"+i);
            i++;
        }
    }

    // 定义一个方法，用来进行do-while循环
    public static void wh(){
        /*
    do-while循环的格式：
    初始化表达式;
    do{
        循环体;
        步进语句;
    } while(条件判断)
     */
        int i = 1;
        do{
            System.out.println("你好！" + i);
            i++;
        } while (i<=2);
    }

    // 定义一个方法，用来进行输入
    /*
    Scanner对象的创建格式:
    Scanner 对象名 = new Scanner(System.in);
     */
    public static void s(){
        Scanner r = new Scanner(System.in);
        System.out.println("请输入：");
        String num = r.next();
        System.out.println("输入的是：" + num);
    }

    // 定义一个方法，scanner作为参数
    public static void param(Scanner sc){
        System.out.println("请输入：");
        String num = sc.next();
        System.out.println("输入的是：" + num);
    }

    // 定义一个方法，scanner作为返回值
    public static Scanner Return(){
        return new Scanner(System.in);
    }

    // 定义一个方法，实现字符串的分割
    public static void strl(){
        String str = "aa,bb,cc";
        System.out.println("以逗号分割");
        String [] result = str.split(",");
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

}

