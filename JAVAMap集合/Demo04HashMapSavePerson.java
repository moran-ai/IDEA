package JAVAMap集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义键值
    Map集合保证key唯一：
        作为key的元素，必须重写hashCode()方法和equals()方法,保证key唯一
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*
        HashMap存储自定义键值
        Key:Person类型
            必须重写hashCode()方法和equals()方法，保证key唯一
        value:String类型
            可以重复
         */
        // 创建HashMap集合
        HashMap<Person, String> map = new HashMap<>();

        // 添加元素
        map.put(new Person("df", 12),"sd");
        map.put(new Person("ds", 32),"gd");
        map.put(new Person("2", 31),"dd");
        map.put(new Person("dq", 42),"2d");

        // 使用entrySet和增强for遍历集合
        Set<Map.Entry<Person, String>> set = map.entrySet();

        for(Map.Entry<Person, String> entry : set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    public static void show01(){
        /*
        HashMap存储自定义键值
        Key:字符串
            重写hashCode()方法和equals()方法，保证Key唯一
        value:Person类型
            value可以重复
         */
        // 创建HashMap集合
        HashMap<String, Person> map = new HashMap<>();

        map.put("北京", new Person("哈", 64));
        map.put("这里", new Person("ki", 54));
        map.put("户籍", new Person("as", 24));
        map.put("北京", new Person("df", 64));

        // 使用KeySet和增强for循环遍历集合
        Set<String> set = map.keySet();

        for(String key:set){
            Person value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
