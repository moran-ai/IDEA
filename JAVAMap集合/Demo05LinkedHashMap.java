package JAVAMap集合;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<k,v> extends HashMap<k,v>
    Map接口的哈希表和链接列表实现，具有可知的迭代顺序
    底层原理:
        哈希表+链表（记录元素的顺序）有序
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        // 创建HashMap集合
        HashMap<String, String> map = new HashMap<>();

        map.put("a", "a");
        map.put("c", "c");
        map.put("b", "b");
        map.put("d", "d");
        System.out.println(map); // key不允许重复，无序集合

        LinkedHashMap<String, String> linke = new LinkedHashMap<>();
        linke.put("a", "a");
        linke.put("c", "c");
        linke.put("b", "b");
        linke.put("d", "d");
        System.out.println(linke); // key不允许重复，有序集合
    }
}
