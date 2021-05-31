package JAVAMap集合;

import java.util.List;
import java.util.Map;
import java.util.Set;

/*
    JDK9的新特性：
        List接口，Set接口，Map接口，里面增加了静态方法of,可以向集合中一次添加多个元素
        static <E> List<E> of (E...elements)
        使用前提：
            当集合中存储元素的个数已经确定，不会在改变时使用
        注意：
            1.of方法只适用于List接口，Set接口和Map接口，不适用于接口的实现类
            2.of方法返回值是一个不能改变的集合，集合不能再使用add,put方法添加元素，否则抛出异常
            3.Set接口和Map接口调用of方法时，不能有重复的元素，否则抛出异常
 */
public class Demo07JDK9 {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c", "d", "a", "c");
        System.out.println(list);
        System.out.println("=================");

        // Set集合不能存储重复元素
        Set<String> set = Set.of("a", "b", "c", "d", "f");
        System.out.println(set);
        System.out.println("=================");

        // Map集合不能存储重复元素
        Map<String,String> map = Map.of("a", "b", "c", "d");
        System.out.println(map);
    }
}
