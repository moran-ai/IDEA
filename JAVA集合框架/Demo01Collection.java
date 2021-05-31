package JAVA集合框架;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/*
    java.util.Collection接口
        所有单列集合的最顶层的接口，里面定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法

     共性方法：
        public boolean add(E e):把给定的对象添加到当前集合中
        public void clear():清空集合中的所有元素
        public boolean remove(E e):把给定的对象在当前集合中删除
        public boolean contains(E e):判断当前集合中是否包含给定的对象
        public boolean isEmpty():判断当前集合是否为空
        public int size():返回集合中元素的个数
        public Object[] toArray() :把集合中的元素，存储到数组中

 */
public class Demo01Collection {
    public static void main(String[] args) {
        // 创建集合对象，使用多态
        // Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        System.out.println(coll); // 重写了toString方法  []
        System.out.println("=========================");

        /*
        public boolean add(E e):把给定的对象添加到当前集合中
        返回值是boolean值，一般都返回true，所以不用接收
         */
        boolean b1 = coll.add("张三");
        System.out.println("b1:" + b1);
        System.out.println(coll); // [张三]
        coll.add("1");
        coll.add("2");
        coll.add("3");
        coll.add("4");
        coll.add("5");
        System.out.println(coll);
        System.out.println("=============================");

        /*
        public boolean remove(E e):把给定的对象在当前集合中删除
        返回boolean值，集合中存在元素，删除元素，返回true
                      集合中不存在元素，删除失败，返回false
         */
        coll.remove("1");
        System.out.println(coll);
        System.out.println("==================");

        /*
        public boolean contains(E e):判断当前集合中是否包含给定的对象
        包含返回true
        不包含返回false
         */
        boolean b2 =  coll.contains("2");
        System.out.println(b2);
        System.out.println("=========================");

        /*
        public boolean isEmpty():判断当前集合是否为空
        集合为空返回true
        集合不为空返回false
         */
        boolean b3 =  coll.isEmpty();
        System.out.println(b3);
        System.out.println("==============================");
        /*
        public int size():返回集合中元素的个数
         */

        int t = coll.size();
        System.out.println(t);
        System.out.println("================================");

        /*
        public Object[] toArray() :把集合中的元素，存储到数组中
         */
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        System.out.println("====================");

        /*
        public void clear():清空集合中的所有元素
        不删除集合
         */
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
        }
    }
}

