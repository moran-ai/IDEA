package JAVA循环结构;

/*
循环求出1-100之间的偶数和
1.既然确定了范围是1-100之间，那么就从1，2，3直到100这么多数字一个一个进行检查
2.总共有100个数字，并非所有的数字都能用，必须是偶数才行，判断(if语句),(偶数: num%2==0)
3.需要一个变量进行累加操作
 */

public class DemoTestWork {
    public static void main(String[] args) {
        // for循环计算1-100之间的偶数之和
        int sum = 0;  // 定义一个累加的变量,用来接收和
        for (int i =1; i <= 100; i++){   // 初始化i=1
            if (i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("for循环计算(1-100之间的偶数之和)的结果是:" + sum);
        System.out.println("for循环");

        System.out.println("============");

        // while循环计算1-100之间的偶数之和
        int number = 0;  // 定义一个变量，用来接收累加的和
        int a = 1;    // 初始化a
        while (a <= 100){
            if (a % 2==0){
                number += a;
            }
            a++;
            }
        System.out.println("while循环计算的(1-100之间的偶数之和)结果是:"+ number);
        System.out.println("while循环");

        System.out.println("===============");

        // do-while循环计算1-100之间的偶数之和
        int nums = 0; // 定义一个变量，用来接收累加之和的值
        int b = 1;   // 初始化b
        do {
            if (b % 2 == 0){
                nums += b;
            }
            b++;
        } while (b <= 100);
        System.out.println("do-while循环计算(1-100之间的偶数之和)的结果是:" + nums);
        System.out.println("do-while循环");
        }

    }
