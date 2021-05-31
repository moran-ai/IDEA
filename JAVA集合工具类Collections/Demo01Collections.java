package JAVA集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作
    方法：
        public static <T> boolean addAll(Collection<T>, T...elements):向集合中添加多个元素
        public static void shuffle(List<?> List):打乱集合顺序
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 集合中添加多个元素
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list); // [a, b, c, d, e]

        // 打乱集合顺序
        Collections.shuffle(list);
        System.out.println(list); // [a, e, d, b, c]
    }
}
