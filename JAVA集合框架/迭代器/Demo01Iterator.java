package JAVA集合框架.迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    java.util.Iterator接口：迭代器，对集合进行遍历
    常用方法：
        boolean hasNext():如果仍有元素可以迭代，则返回true
            判断集合中还有没有下一个元素，有就返回true,没有返回false
        E next() 返回迭代的下一个元素
            取出集合中的下一个元素
     Iterator迭代器是一个接口，无法直接创建对象使用，需要使用实现类，获取实现类的方式特殊
     Collection接口中有一个方法，叫Iterator(),这个方法返回的是迭代器的实现类对象
        Iterator<E> iterator() 返回此Iterator的元素上进行迭代的迭代器

     迭代器的使用步骤：
        1.使用集合中的方法iterator(),获取迭代器的实现类对象，使用Iterator接口接收(多态)
        2.使用Iterator接口中的方法hasNext()判断集合中有没有下一个元素
        3.使用Iterator接口中的方法next()取出集合中的下一个元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> coll = new ArrayList<>();

        // 集合中添加元素
        coll.add("1");
        coll.add("2");
        coll.add("3");
        coll.add("4");

        /*
        1.使用集合中的方法iterator(),获取迭代器的实现类对象，使用Iterator接口接收(多态)
        注意：
            Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就是什么泛型
         */
        // 获取迭代器实现类的对象
        Iterator<String> it =  coll.iterator();

        // 2.使用Iterator接口中的方法hasNext()判断集合中有没有下一个元素
        boolean b = it.hasNext();
       // System.out.println(b);

        // 3.使用Iterator接口中的方法next()取出集合中的下一个元素
       // String s = it.next();
        //System.out.println(s);

        // while循环取出集合中的所有元素
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("=============================");
        // for循环取出集合中的所有元素
        for (Iterator<String> it1 = coll.iterator(); it1.hasNext();){
            String e = it1.next();
            System.out.println(e);
        }
    }
}
