package JAVA常用集和;

import java.util.HashSet;

/*
    Set集合不允许存储重复数据的原理
    Set集合在调用add()方法时，add()方法会调用元素的hashCode()方法和equals()方法判断元素是否重复
    Set集合存储不重复元素的前提：存储的元素必须重写hashCode方法和equals方法
 */
public class Demo04HashSetSaveString {
    public static void main(String[] args) {
        // 创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = ("abc");
        String s2 = ("abc");
        /*
        add()方法会调用s1的hashCode()方法，计算字符串"abc"的哈希值
        在集合中有没有这个字符串的哈希值，如果没有，就把s1存入集合中
         */
        set.add(s1);

        /*
        add()方法会调用s2的hashCode()方法，计算字符串"abc"的哈希值
        在集合中有没有这个字符串的哈希值，发现有（哈希冲突），s2会调用equals()方法和哈希值相同的
        元素进行比较，s2.equals(s1),结果返回true,两个元素的哈希值相同，发现两个元素相同，就不会把
        s2存入集合中
         */
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);

    }
}
