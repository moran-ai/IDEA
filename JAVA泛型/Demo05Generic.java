package JAVA泛型;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符
    ?:代表任意的数据类型
使用方法：
    1.不能创建对象使用
    2.只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");

        printArray(list01);
        System.out.println("=======================");
        printArray(list02);
    }

    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    不知道ArrayList集合使用什么数据类型的数据，可以使用泛型通配符?来接收
    注意:
        泛型没有继承概念
     */
    public static void printArray(ArrayList<?> list){
        // 使用迭代器遍历集合
        Iterator<?> l = list.iterator();
        while (l.hasNext()){
            Object s = l.next();
            System.out.println(s);
        }
    }
}
