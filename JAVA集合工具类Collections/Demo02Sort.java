package JAVA集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作
    方法：
        public static <T> void sort(List<T>, Lsit):将集合中的元素按照默认规则排序

    注意：
        sort()方法使用前提,被排序的集合必须实现Comparable接口，重写接口中的方法compareTo定义排序的规则

    Comparable排序规则:
          升序：this(自己) - 参数
          降序：参数 - this(自己)
 */
public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Integer> lsit01 = new ArrayList<>();
        lsit01.add(1);
        lsit01.add(3);
        lsit01.add(2);
        System.out.println(lsit01);

        // 排序 默认是升序
        Collections.sort(lsit01);
        System.out.println(lsit01);
        System.out.println("================================");
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("c");
        list02.add("b");
        System.out.println(list02);

        Collections.sort(list02);
        System.out.println(list02);
        System.out.println("================================");

        ArrayList<Person> list03 = new ArrayList<>();
        list03.add(new Person("小李", 18));
        list03.add(new Person("小明", 22));
        list03.add(new Person("小局", 15));
        System.out.println(list03);

        Collections.sort(list03);
        System.out.println(list03);
    }
}
