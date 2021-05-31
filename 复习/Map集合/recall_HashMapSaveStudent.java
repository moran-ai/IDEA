package 复习.Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合存储自定义类型数据
 */
public class recall_HashMapSaveStudent {
    public static void main(String[] args) {
        show();
    }

    public static void show(){
        /*
        存储自定义对象，必须重写hashCode()方法和equals()方法来保证key唯一
         */
        // 创建Map集合
        Map<Student, Integer> map = new HashMap<>();

        // 集合中添加元素
        map.put(new Student("胡歌", 34, "123", "345公斤"), 1);
        map.put(new Student("马化腾", 44, "129", "545公斤"), 2);
        map.put(new Student("马云", 64, "124", "344公斤"), 3);

        // 使用entrySet()和增强型for循环遍历集合
        Set<Map.Entry<Student, Integer>> set = map.entrySet();
        for(Map.Entry<Student,Integer> e : set){
            // 使用Entry对象中的getkey()方法和getvalue()方法获取键与值
            Student key = e.getKey();
            Integer value = e.getValue();
            System.out.println("key：" + key + "，" + "value：" + value);
        }
    }
}
