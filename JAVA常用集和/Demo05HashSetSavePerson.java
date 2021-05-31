package JAVA常用集和;

import java.util.HashSet;

/*
    HashSet存储自定义元素
    set集合保证元素唯一：
        存储的元素(String, Integer, ... Student),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人，视为同一人，只能存储一次
 */
public class Demo05HashSetSavePerson {
    public static void main(String[] args) {
        // 创建HashSet集合，存储Person
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("小明", 18);
        Person p2 = new Person("小李", 20);
        Person p3 = new Person("小李", 20);

        // 打印哈希值
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        // 比较地址值
        System.out.println(p2.equals(p3));

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }

}
