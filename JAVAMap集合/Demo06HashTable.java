package JAVAMap集合;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<k,v> implements Map<k,v>接口

    Hashtable特点：
        1.底层是一个哈希表，是一个线层安全的集合，是单线程，速度慢
        2.集合不能存储null值，null键
        3.在jdk1.2后之后被HashMap集合取代
        4.子类Properties依然可以使用,Properties是唯一一个与IO流相结合的集合

    HashMap特点：
        1.底层是一个哈希表，是一个线程不安全的集合，是多线程，速度快
        2.可以存储null值，null键

 */
public class Demo06HashTable {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "a");
        map.put("b", null);
        map.put(null, null);
        System.out.println(map);
        System.out.println("=========================");
        Hashtable<String, String> table = new Hashtable<>();
        table.put(null, "a");
        table.put("b", null);
        System.out.println(table);
    }
}
