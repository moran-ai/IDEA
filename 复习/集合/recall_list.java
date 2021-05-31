package 复习.集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class recall_list {
    public static void main(String[] args) {
        // 创建一个ArrayList集合对象
        List<String> list = new ArrayList<>();

        // 集合中添加元素
        list.add("1");
        list.add("4");
        list.add("2");
        list.add("5");
        System.out.println(list);
        System.out.println("=============================");

        // 获取集合中指定位置的元素
        String l = list.get(3);
        System.out.println("获取的集合元素是：" + l);
        System.out.println("=============================");

        // 删除集合中指定位置的元素
        String t = list.remove(2);
        System.out.println("集合中删除的元素是：" + t);

        // 替换集合中的元素
        String setE = list.set(2, "王");
        System.out.println("集合中替换的元素是：" + setE);
        System.out.println("=============================");
        System.out.println(list);
        System.out.println("=============================");

        // 在集合指定的位置前面添加元素
        list.add(2, "小");
        System.out.println(list);
        System.out.println("=============================");

        /*
        遍历集合的方式：for循环，迭代器，增强型for循环
         */
        System.out.println("使用普通for循环进行遍历集合");
        // 使用for循环遍历集合
        for(int i = 0; i < list.size(); i++){
            String ls = list.get(i);
            System.out.println(ls);
        }
        System.out.println("=============================");

        System.out.println("=============================");
        System.out.println("使用迭代器遍历集合");
        // 创建迭代器
        Iterator<String> tl = list.iterator();
        while (tl.hasNext()){
            String obj = tl.next();
            System.out.println(obj);
        }
        System.out.println("=============================");

        System.out.println("=============================");
        System.out.println("使用增强型for循环遍历");
        // 使用增强型for循环进行遍历
        for(String n : list){
            System.out.println(n);
        }
        System.out.println("=============================");
    }

}
