package 复习.Map集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历的第一种方式:通过键找值的方式
Map集合中的方法：
    Set<K> KeySet() 返回此映射当中包含的键的Set视图
实现步骤：
   1.使用Map集合中的方法KeySet()把Map集合中所有的Key取出来，存储到一个Set集合中
   2.遍历Set集合，获取Map集合的每一个key
   3.通过Map集合中的方法get(key),通过key找到value
 */
public class recall_KeySet {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();

        // 集合中添加元素
        map.put("a", 1);
        map.put("b", 4);
        map.put("c", 3);
        map.put("d", 7);

        // 使用Map集合中的方法KeySet()把key全取出来，放在Set集合中
        // 创建一个Set集合
        Set<String> set = map.keySet();

        // 使用迭代器遍历Set集合
        // 创建一个迭代器
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            // 所有的键
            String s = it.next();

            // 通过键取出值 使用Map集合中的get方法
            Integer value = map.get(s);
            System.out.println("Key：" + s + "，" + "Value：" + value);
        }
    }
}
