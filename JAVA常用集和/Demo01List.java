package JAVA常用集和;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.List接口 extends Collection接口
    特点：
        1.有序的集合，存储和取出元素的顺序是一致的
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的数据

    List接口中带索引的方法（特有）
        public void add(int index, E element):特指定的元素，添加到该集合的指定位置上
        public E get(int index):返回集合中指定位置的元素
        public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
        public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素
    注意：
        操作索引时，要防止索引越界异常
 */

public class Demo01List {
    public static void main(String[] args) {
        // 创建一个List集合对象
        List<String> list = new ArrayList<>();

        // 使用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");

        // 打印集合
        System.out.println(list);
        System.out.println("=============================");

        /*
        public void add(int index, E element):特指定的元素，添加到该集合的指定位置上
        在c和d之间添加元素itheima
         */
        list.add(3,"itheima");
        System.out.println(list); // itheima
        System.out.println("=============================");

        /*
        public E get(int index):返回集合中指定位置的元素
        移除c
         */
        String removeE = list.remove(2);
        System.out.println("被移除的元素的是：" + removeE);
        System.out.println(list);
        System.out.println("=============================");

        /*
        public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素
        把最后一个a替换为A
         */
        String setE = list.set(4, "A");
        System.out.println("被替换的元素是：" + setE);
        System.out.println(list);
        System.out.println("=============================");

        /*
        public E get(int index):返回集合中指定位置的元素
        List集合遍历有3种方式
         */
        // 1.使用普通的for循环
        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("普通for循环遍历");
        System.out.println("=============================");

        // 2.使用迭代器
        Iterator<String> l = list.iterator();
        while (l.hasNext()){
            String obj = l.next();
            System.out.println(obj);
        }

        System.out.println("使用迭代器遍历");
        System.out.println("=============================");

        // 3.使用增强for循环
        for(String str:list){
            System.out.println(str);
        }
        System.out.println("使用增强for循环");
        System.out.println("=============================");
    }
}
