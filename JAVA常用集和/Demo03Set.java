package JAVA常用集和;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    java.util.Set接口 extends Collection接口
    特点：
        1.不允许存储重复元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环进行遍历

    java.util.HashSet集合 implements Set接口
    特点：
        1.不允许存储重复元素
        2.没有索引，没有带索引的方法，也不能使用普通的for循环进行遍历
        3.是一个无序集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构（查询速度非常快）
 */
public class Demo03Set {
    public static void main(String[] args) {
        // 创建集合对象
        Set<Integer> set = new HashSet<>();

        // 使用add方法添加元素
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(4);

        // 使用迭代器进行遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer l = it.next();
            System.out.println(l);
        }
    }
}
