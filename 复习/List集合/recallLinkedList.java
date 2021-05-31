package 复习.List集合;

import java.util.LinkedList;

/*
java.util.LinkedList集合 implements List接口
LinkedList集合的特点：
    1.底层是一个链表结构，查询慢，增删快
    2.里面包含了大量的操作首尾元素的方法

注意：
    使用LinkedList集合特有的方法，不能使用多态
常用方法：
    1.public void addFirst(E e):将指定的元素插入集合的开头
    2.public void addLat(E e):将指定的元素插入集合的末尾
    3.public E getFirst() :获取集合的第一个元素
    4.public E getLat() : 获取集合的最后一个元素
    5.public E removeFisrt():移除并返回集合的第一个元素
    6.public E removeLast():移除并返回集合的最后一个元素
    7.public E pop():从此列表所表示的堆栈处弹出一个元素 等效于 public E removeFirst()
    8.public boolean isEmpty()：如果集合中没有元素，返回true
    9.public void push(E e):将元素推入此列表表示的堆栈 等效于public void addFirst(E e)
 */
public class recallLinkedList {
    public static void main(String[] args) {
        // 创建一个LinkedList集合，使用LinkedList集合特有的方法，不能使用多态
        LinkedList<String> list = new LinkedList<>();

        // 集合中添加元素
        list.add("a");
        list.add("b");
        list.add("f");
        list.add("d");

        // 在集合中的第一位置添加元素
        list.addFirst("we");
        System.out.println(list);
        System.out.println("===============================");

        // 在集合的最后一个位置添加元素
        list.addLast("ewrt");
        System.out.println(list);
        System.out.println("===============================");

        // 取出集合中的第一个元素
        String a = list.getFirst();
        System.out.println("取出集合中的第一元素是：" + a);
        System.out.println(list);
        System.out.println("===============================");
        // 取出集合中的最后一个元素
        String b = list.getLast();
        System.out.println("取出集合中的最后一个元素是：" + b);
        System.out.println(list);
        System.out.println("===============================");

        // 移除集合中的第一个元素
        String c = list.removeFirst();
        System.out.println("被移除的第一个元素是：" + c);
        System.out.println(list);
        System.out.println("===============================");
        // 移除集合中的最后一个元素
        String d = list.removeLast();
        System.out.println("被移除的最后一个元素是：" + d);
        System.out.println(list);
        System.out.println("===============================");

        // 判断集合是否为空 集合为空，返回true
        boolean f = list.isEmpty();
        System.out.println(f);
    }
}
