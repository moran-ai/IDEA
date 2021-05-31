package 复习.集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
遍历Map集合的第二种方式：使用EntrySet
集合中的方法：Set<Map.Entry<k,v>> entrySet() 返回此映射中包含的映射关系视图

实现步骤：
    1.使用Map集合中的方法，EntrySet(),把Map集合中的多个Entry对象取出来，放在一个Set集合中
    2.遍历Set集合，获取每一个Entry对象
    3.使用Entry对象中的方法getkey()和getvalue()获取键与值
 */
public class recall_EntrySet {
    public static void main(String[] args) {
        show01();
    }

    /*
    定义一个方法，遍历Map集合
     */
    public static void show01(){
        // 创建一个Map集合
        Map<String, String> map = new HashMap<>();

        // 集合中添加元素
        map.put("1", "2");
        map.put("3", "7");
        map.put("4", "3");
        map.put("5", "6");

        // 使用Map集合中的方法entrySet()，把Map集合中多个Entry对象取出来，存放到一个Set集合中
        // 创建一个Set集合
        Set<Map.Entry<String, String>> m = map.entrySet();

        // 使用迭代器遍历Set集合
        // 创建一个迭代器
        Iterator<Map.Entry<String, String>> it = m.iterator();
        while(it.hasNext()){
            Map.Entry<String, String> e = it.next();

            // 使用Entry对象中的getkey()和getvalue()方法获取键与值
            String key = e.getKey();
            String value = e.getValue();
            System.out.println("Key：" + key + "，" + "value：" + value);
        }
    }
}