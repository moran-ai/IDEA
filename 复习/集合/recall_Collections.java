package 复习.集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
集合工具类:
    java.util.Collections 是集合工具类，用来对集合进行操作
    方法：
        public static <T> boolean addAll(Collections<T>, T...elements) 向集合中添加多个元素
        public static void shuffle(List<?> list) 打乱集合顺序
        public static <T> void sort(List<T>, List) 将集合中的元素按照默认规则进行排序
    注意：
        sort()方法使用的前提，被排序的集合必须实现Comparable接口，重写接口中的方法compareTo定义排序的规则
        Comparable规则:
            this - 参数  :升序
            参数 - this  :降序
 */
public class recall_Collections {
    public static void main(String[] args) {
        // 创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();

        // 向集合中添加多个元素
        Collections.addAll(list, "2", "3", "4", "5", "6");
        System.out.println(list);
        System.out.println("=======================================");

        // 打乱集合的顺序
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("=======================================");

        // 对集合进行排序,默认为升序
        Collections.sort(list);
        System.out.println(list);

        // 创建一个集合
        ArrayList<People> list01 = new ArrayList<>();

        // 集合中添加元素
        list01.add(new People("葵", 23, "189", "50公斤", "女", "演员"));
        list01.add(new People("胡歌", 25, "190", "60公斤", "男", "演员"));
        list01.add(new People("赵丽颖", 24, "179", "55公斤", "女", "演员"));
        list01.add(new People("鹿晗", 28, "187", "58公斤", "男", "演员"));

        // 打印集合
        System.out.println(list01);
        System.out.println("===============================================");

        // 对自定义的集合进行升序排序
        Collections.sort(list01);
        System.out.println(list01);
        System.out.println("===============================================");

        // 使用增强型for循环对集合进行遍历
        for(People p : list01){
               System.out.println(p);
        }
        System.out.println("===============================================");

        // 使用迭代器对集合进行遍历
        // 创建一个迭代器
        Iterator<People> ple = list01.iterator();

        // 使用while循环进行遍历
        while(ple.hasNext()){
            People pl = ple.next();
            System.out.println(pl);
        }

        // 使用comparator进行排序
        Collections.sort(list01, new Comparator<People>() {
            // 重写compare()方法
            @Override
            public int compare(People o1, People o2) {
                // 按照年龄的升序来排序
                return o1.getAge() - o2.getAge();
            }
        });
    }
}
