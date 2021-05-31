package JAVA集合;

import java.util.ArrayList;
/*
区别：数组的长度不可变，(ArrayList)集合的长度是可以随意变化的
有一个ArrayList来说，有一个尖括号<E>代表泛型
泛型：也就是装在集合中的所有元素，全部都是统一的类型
注意：泛型只能是引用类型，不能是基本数据类型

注意事项：
    对于集合来说，直接打印不是地址值，而是内容
    如果内容为空，那么打印的结果就是[]
 */

public class DemoArrayList {
    public static void main(String[] args) {
        // 创建一个集合,集合的名称是list，里面全是字符串类型的数据
        // 从JDK1.7开始，右侧的尖括号内部可以不写，但是<>还是要写
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // 输出[]

        // 集合添加数据
        list.add("好");
        list.add("费尔巴哈");
        list.add("及洗个");
        list.add("几乎撒");
        System.out.println(list);


    }
}
