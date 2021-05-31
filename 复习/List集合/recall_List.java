package 复习.List集合;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List 接口 extends Collection接口
特点：
    1.有序的集合，存储元素的顺序和取出元素的顺序是一致的。
    2.有索引，包含了一些带索引的方法
    3.允许存储重复的数据

成员方法：
    public void add(int index, E element):指定的元素，添加到集合的指定位置上
    public E get(int index):返回集合中指定位置的元素
    public E remove(int index):移除集合中指定位置的元素，返回的是被移除的元素
    public E set(int index, E element):用指定的元素替换集合中指定位置的元素，返回更新前的元素
 */
public class recall_List {
    public static void main(String[] args) {
        // 创建List集合
        List<String> list = new ArrayList<>();

        // 集合中添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");

        // 集合中添加元素
        list.add(3, "6");
        System.out.println(list);
        System.out.println("========================");
        // 集合中取出元素
        String a = list.get(3);
        System.out.println(list);
        System.out.println("取出的元素是：" + a);
        System.out.println("========================");
        // 集合中移除元素
        String  b = list.remove(2);
        System.out.println(list);
        System.out.println("被移除的元素是：" + b);
        System.out.println("========================");
        // 替换集合中的元素
        String c = list.set(1, "hao");
        System.out.println(list);
        System.out.println("被替换的元素是：" + c);
    }
}
