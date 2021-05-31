package 复习.Map集合;

import java.util.HashMap;
import java.util.Map;

/*
java.util.Map<k,v>集合;
   特点:
    1.Map集合是一个双列集合，一个元素包含一个(Key,Value)
    2.Map集合中的元素Key和Value数据类型可以相同，也可以不相同
    3.Map集合中的元素Key是唯一的，不能重复
    4.Map集合中的Key和Value是一一对应的

   子类：
        HashMap:是一个无序的集合，存储和取出元素的顺序不一致
        LinkedHashMap：是一个有序的集合，存储和取出元素的顺序可能不一致


 */
public class DemoMap {
    public static void main(String[] args) {
        // 创建一个Map集合
        Map<String, Integer> map = new HashMap<>();

        // 集合中添加元素 put方法
        map.put("w",3);
        map.put("f",2);
        map.put("s",1);

        // 判断集合中是否包含指定的键 boolean containkey(Object key)包含返回ture,不包含返回false
        boolean k1 = map.containsKey("s");
        System.out.println(k1);
        System.out.println("=====================================");
        // 集合中取出元素 public V get(Object key):根据指定的键在集合获取相应的值
        // 返回值：key存在，返回取出的值，key不存在，返回null
        Integer v1 = map.get("w");
        System.out.println(v1);
        System.out.println("=====================================");
        // 集合中删除元素，public V remove(Obejct key) 把指定的键和所对应的值从集合中删除，返回被删除的元素
        // key存在：返回被删除的值 key不存在，返回null
        Integer v2 = map.remove("f");
        System.out.println("被删除的元素是：" + v2);
        System.out.println(map);
        System.out.println("=====================================");

        show();
    }

    private static void show() {
        /*
        定义方法，向集合中添加元素
        public V put(key, value):把指定的键和值添加到集合中
        返回值：V
        存储键值对时，key不重复，返回null
        存储键值对时，key重复，会使用新的value来代替集合中重复的value,返回被替换的value值
         */
        // 创建一个Map集合
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("a", "1");
        String v2 = map.put("c", "3");
        String v3 = map.put("b", "2");
        System.out.println(map);
    }
}