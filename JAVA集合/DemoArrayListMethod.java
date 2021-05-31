package JAVA集合;

/*
集合中的常用方法:
    1.添加：public boolean add(E e) 向集合中添加元素，参数类型和泛型一样
    对于ArrayList集合来说，方法add添加元素一定成功，返回值可用可不用；
    但是对于其他集合来说，add添加元素不一定成功,所以返回值代表是否成功
    2.获取元素：public E get(int index)  参数是索引序号 返回值就是对应位置的数据
    3.删除元素 public E remove(int index) 参数是索引序号，返回值是被删除的元素
    4.获取的集合的尺寸长度：public int size() 返回值是集合中包含的元素个数
 */

import java.util.ArrayList;

public class DemoArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 向集合中添加元素  add
        boolean success = list.add("赵丽颖");
        System.out.println(list);
        System.out.println("添加元素是否成功：" + success);

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);

        // 获取元素:get
        String name = list.get(0);
        System.out.println("第一个名字是：" + name);

        // 删除元素 remove
        String n = list.remove(1);
        System.out.println("删除的元素是：" + n);
        System.out.println(list);

        // 获取集合的尺寸
        int a = list.size();
        System.out.println("集合的尺寸是：" + a);

    }
}
