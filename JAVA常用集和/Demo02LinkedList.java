package JAVA常用集和;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点：
        1.底层是一个链表结构：查询慢，增删慢
        2.里面包含了大量操作首尾元素的方法
    注意:
        使用LinkedList集合特有的方法，不能使用多态
    特有方法：
        public void addFirst(E e):将指定元素插入到列表的开头 等效于 public void addFirst(E e)
        public void addLast(E e):将指定元素插入到列表的末尾 等效于add()方法
        public void push(E e):将元素推入此列表所表示的堆栈

        public E getFirst():返回此列表的第一个元素
        public E getLast():返回此列表的最后一个元素

        public E removeFirst():移除并返回此列表的第一个元素
        public E removeLast():移除并返回此列表的最后一个元素
        public E pop():从此列表所表示的堆栈处弹出一个元素 等效于 public E removeFirst()

        public boolean isEmpty():如果列表没有元素，则返回true

 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show03();
    }

    /*
        public E removeFirst():移除并返回此列表的第一个元素
        public E removeLast():移除并返回此列表的最后一个元素
        public E pop():从此列表所表示的堆栈处弹出一个元素
     */
    private static void show03() {
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        // 使用add()方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String first = linked.removeFirst();
        System.out.println("移除的第一个元素是："+first);
        System.out.println("*****************************");
        String last = linked.removeLast();
        System.out.println("移除的最后一个元素是："+last);
        System.out.println(linked);
    }

    /*
        public E getFirst():返回此列表的第一个元素
        public E getLast():返回此列表的最后一个元素
     */
    private static void show02() {
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        // 使用add()方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");

        String first = linked.getFirst();
        System.out.println(first);
        System.out.println("*****************************");
        String last = linked.getLast();
        System.out.println(last);

    }

    /*
        public void addFirst(E e):将指定元素插入到列表的开头
        public void addLast(E e):将指定元素插入到列表的末尾 等效于add()方法
        public void push(E e):将元素推入此列表所表示的堆栈 等效于 public void addFirst(E e)

     */
    public static void show01(){
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();

        // 使用add()方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked); // [a, b, c]
        System.out.println("==============================");

        /*
            public void addFirst(E e):将指定元素插入到列表的开头
         */
        linked.addFirst("www");
        System.out.println(linked); // [www, a, b, c]
        System.out.println("==============================");

        /*
            public void addLast(E e):将指定元素插入到列表的末尾 等效于add()方法
         */
        linked.addLast("com");
        System.out.println(linked); // [www, a, b, c, com]
        System.out.println("==============================");


    }
}
