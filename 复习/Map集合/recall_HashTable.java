package 复习.Map集合;

import java.util.HashMap;
import java.util.Hashtable;

/*
java.util.Hashtable<k,v> implements Map<k,v>接口

HashTable特点:
    1.不能存储null值和null键
    2.底层是一个哈希表，是一个线程安全的集合，是单线程，速度慢

HashMap特点;
    1.可以存储null值和null键
    2.底层是一个哈希表，是一个线程不安全的集合，死话多线程，速度快
 */
public class recall_HashTable {
    public static void main(String[] args) {
        // 创建HashTable集合
        Hashtable<String, String> table = new Hashtable<>();

        // 集合中添加数据
        table.put("null","1");
        table.put("null1", "null");
        // 不能存储null键和null值
//        table.put(null, null);
        System.out.println(table);
        System.out.println("================================");

        // 创建HashMap集合
        HashMap<String, String> map = new HashMap<>();

        // 集合中添加数据
        map.put(null, null);
        // 集合中可以存储null值和null键
        System.out.println(map);
    }
}