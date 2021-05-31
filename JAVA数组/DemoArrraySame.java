package JAVA数组;

public class DemoArrraySame {
    public static void main(String[] args) {
        // 动态初始化数组
        int[] arrayA = new int[5];
        // 整数默认值为0
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("==========");
        // 该变数组中的默认值
        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA[0]);  // 输出0
        System.out.println(arrayA[1]);  // 输出10
        System.out.println(arrayA[2]);  // 输出20
        System.out.println("============");
        // 将arrayA数组中的地址值，赋值给arrayB
        int[] arrayB = arrayA;
        // 整数默认值为0
        System.out.println(arrayB[0]);   // 输出0
        System.out.println(arrayB[1]);  // 输出10
        System.out.println(arrayB[2]);  // 输出20
        System.out.println("==========");
        // 该变数组中的默认值
        arrayB[1] = 100;
        arrayB[2] = 200;
        System.out.println(arrayB[0]);  // 输出0
        System.out.println(arrayB[1]);  // 输出100
        System.out.println(arrayB[2]);  // 输出200

    }
}
