package JAVA泛型;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    /*
    创建集合对象，使用泛型
    好处：
        1.避免了对象转换麻烦，存储的是什么类型，取出的就是什么类型
        2.把运行期异常(代码运行之后抛出的异常)，提升到了编译期异常(编写代码时出现的异常)
    弊端：
        泛型是什么类型，只能存储什么类型的数据

     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("234");

        // 使用迭代器遍历list集合
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }

    /*
    创建一个集合，不使用泛型
    好处：
        集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    弊端：
        不安全，会引发异常
     */
    public static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        // 使用迭代器遍历list集合
        Iterator it = list.iterator();

        // 使用迭代器方法中的hasNext()和next()方法遍历集合
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            // 使用String类特有的方法，length获取字符串的长度，不能直接使用，因为是多态
            // 需要向下转型
            // 会抛出java.lang.ClassCastException类型转换异常，不能把Integer类型转换为String类型
            String s = (String) obj;
            System.out.println(s.length());
        }
    }
}
