package JAVAMap集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合中的第一种遍历方式：通过键找值的方式
    Map集合中的方法：
        Set<K> KeySet() 返回此映射当中包含的键的Set视图
    实现步骤：
        1.使用Map集合中的方法KeySet,把Map集合中的所有Key取出来，存储到一个Set集合中
        2.遍历Set集合，获取Map集合中的每一个Key
        3.通过Map集合中的方法get(key),通过Key找到value
 */
public class Demo02KeySet {
    public static void main(String[] args) {
        // 创建Map集合
        Map<String, Integer> map = new HashMap<>();
        map.put("q", 1);
        map.put("w", 3);
        map.put("s", 4);
        map.put("z", 2);

        /*
        1.使用Map集合中的方法KeySet,把Map集合中的所有Key取出来，存储到一个Set集合中
         */
        Set<String> set = map.keySet();

        /*
        2.遍历Set集合，获取Map集合中的每一个Key
         */
        // 使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();

            // 3.通过Map集合中的方法get(key),通过Key找到value
            Integer value = map.get(s);
            System.out.println(s + ":" + value);
        }

    }
}
