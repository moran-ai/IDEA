package JAVA数组工具类Arrays;

import java.util.Arrays;

/*
题目：使用Arrays的有关API,对随机的字符串进行升序排列，并进行倒叙打印
 */
public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "12weradgajkaj89";

        // 进行升序排列
        // 必须是一个数组，才能是用Arrays.sort()方法
        // String --> toCharArray()
        char [] chars = str.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        // 倒序遍历
        for (int i = chars.length - 1; i >= 0; i--){
            System.out.println(chars[i]);
        }
    }
}
