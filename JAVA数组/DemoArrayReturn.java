package JAVA数组;

/*
一个方法可以有多个参数，但是只有0个或者1个返回值
 如果希望一个方法当中产生了多个结果数据进行返回，怎么办？
 解决方案：使用一个数组作为返回值类型

 总结：
    1.数组作为方法的参数，传递进去的是数组的地址值
    2.数组作为方法的返回值，返回的也是数组的地址值
 */

public class DemoArrayReturn {
    public static void main(String[] args) {
        int [] result = calaulate(10 ,20 ,30);
        System.out.println(result);  // 返回的是地址值
        System.out.println("=======");
        System.out.println("总和：" + result[0]);
        System.out.println("平均值：" + result[1]);
    }

    public static int[]  calaulate(int a , int b, int c){
        int sum = a + b + c; // 和
        int avg = sum / 3;  // 平均数

        // 两个结果都希望返回
        int[] arrary = new int[2];
        arrary[0] = sum;
        arrary[1] = avg;

        return arrary;

       /*
        // 静态初始化写法
        int [] array = {sum, avg};
        return array;
        */
    }
}
