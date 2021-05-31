package JAVAMap集合;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点：
        1.Map集合是一个双列集合，一个元素包含有（一个key,一个value）
        2.Map集合中的元素key和value的数据类型可以相同，也可以不同
        3.Map集合中的元素，key是不允许重复的
        4.Map集合中的元素,key和value是一一对应的

   java.util.HashMap<k,v>集合 implements Map<k, v>接口
   HashMap集合的特点：
        1.HashMao集合的底层是一个哈希表：查询速度非常快
            JDK1.8之前：数组+单向链表
            JDK1.8之后：数组+单向链表/红黑树(链表的长度超过8)：提高查询的速度
        2.HashMap集合是一个无序的集合，存储元素和取出元素的顺序有可能不一致

   java.util.LinkedHashMap<k, v>集合 extends HashMap<k,v>集合
   LinkedHashMap集合的特点：
        1.LinkedHashMap集合的底层是哈希表+链表（保证迭代的顺序）
        2.LinkedHashMap集合是一个有序集合，存储和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        show04();
    }

    private static void show04() {
        /*
            boolean containkey(Object key):判断集合中是否包含指定的键
            包含返回true,不包含返回false
         */

        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("q", 1);
        map.put("w", 3);
        map.put("s", 4);
        map.put("z", 2);

        boolean k1 = map.containsKey("s");
        System.out.println(k1);
    }

    private static void show03() {
        /*
            public V get(Object Key):根据指定的键，在Map集合中获取对应的值
                返回值：
                      key存在，返回取出的值
                      key不存在，返回null
         */

        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("q", 1);
        map.put("w", 3);
        map.put("s", 4);
        map.put("z", 2);

        Integer v1 = map.get("w");
        System.out.println(v1);

        System.out.println(map);
    }

    private static void show02() {
        /*
        public V remove(Object key):把指定的键所对应的键值对元素，在Map集合中删除，返回被删除的元素
        返回值：V
        key存在，返回被删除的元素
        key不存在，返回null
     */

        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("q", 1);
        map.put("w", 3);
        map.put("s", 4);
        map.put("z", 2);

        Integer it = map.remove("q");
        System.out.println("被删除的值是：" + it);
        
        System.out.println(map);

    }

    private static void show01() {
         /*
        public V put(key, value):把指定的键和指定的值添加到Map集合中
            返回值是：V
                存储键值对时，key不重复，返回值是null
                存储键值对时，key重复，会使用新的value来替换Map集合中重复的value，返回被替换的value值
     */

        // 创建Map集合 多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("a", "3");
        System.out.println(v1);

        String v2 = map.put("a", "1");
        System.out.println(v2); // 3
        map.put("yyy", "zzz");
        map.put("y", "zzz");
        map.put("y1", "df");
        map.put("4", "fg");

        System.out.println(map);
    }
}
