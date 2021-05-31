package JAVA面向对象;

import java.util.Arrays;

/*
面向过程：当需要实现一个功能时，每一个具体的步骤，细节都要详细处理
面向对象：当需要实现一个功能时，将该功能的完成交给一个已经具有该功能的对象，不关心具体的步骤
 */
public class DemoPrintArray {
    public static void main(String[] args) {
        int [] array = {10, 20, 30};

        // 打印格式为：[10, 20, 30]
        // 面向过程,每一个步骤都要详细处理
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length -1){ // 如果是最后一个元素，就用"]"连接
                System.out.println(array[i] + "]");
            }else {  // 如果不是最后一个元素，就用","隔开
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("============");

        // 面向对象
        // 找到JDK提供的Arrays类
        // 其中有一个toString方法，直接就能把数组变成想要的格式的字符串
        System.out.println(Arrays.toString(array));
    }
}
