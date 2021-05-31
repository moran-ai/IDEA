package JAVA数组工具类Arrays;

import java.util.Arrays;

/*
java.util.Arrays是一个与数组相关的工具类，里面提供了大量的静态方法，用来实现数组的操作

public static String toString(数组):将参数数组变为字符串，（按照默认格式：[元素1，元素2，元素3...]
public static void sort(数组):对数组按照默认升序（从小到大）进行排序

备注：
1.如果是数字：sort默认按照升序排列
2.如果是字母：sort默认字母升序
3.如果是自定义的类型，自定义的类型需要有Comparable或者Comparaor接口的支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int [] arrays = {10, 20, 30};
        String array = Arrays.toString(arrays);  // 将数组转为字符粗
        System.out.println(array);
        System.out.println("===================");
        int [] array1 = {2, 4, 6, 12};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        // 倒叙
        for (int i = array1.length-1; i >= 0; i--){
            System.out.println(array1[i]);
        }
        System.out.println("===================");
        String [] array2 = {"aaa", "bbb", "ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
