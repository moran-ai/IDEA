package JAVA数组;

/*
数组元素的反转:
    本来的样子:[1, 2, 3, 4]
    反转后的样子:[4, 3, 2, 1]

要求不能使用新数组，就用原来的唯一的数组
1.数组元素反转，其实就是对称位置的元素交换
2.通常遍历数组是用一个索引
    数组反转是用两个索引
    int min = 0;
    int max = array.length-1
3.如何交换两个变量的值  用第三个变量
int a = 10;
int b = 20;
如果是两个水杯，都是满的，如何交换？需要第三个杯子

 4.什么时候停止交换
 (1)min == max
 (2) min > max

 什么时候应该交换 min < max
 */
public class DemoArrayReverse {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

        // 遍历打印数组原来的样子
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=========");

        /*
        初始化语句：int min = 0, max = array.length-1
         条件判断： min < max
         步进表达式: min++, max--
         循环体:用第三个变量
         */
        for (int min = 0, max = array.length-1; min < max; min++, max--){
            // 反转
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
