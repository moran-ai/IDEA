package JAVA数组;

/*
动态初始化(指定长度)：在创建数组时，直接指定长度
静态初始化(指定内容)：在创建数组时，不直接指定长度，而是直接指定具体的内容

静态初始化的格式：
    数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, ...};

 注意事项：
    1.虽然静态初始化没有直接告诉长度，但是根据大括号里面具体元素的内容，可以自动推算出长度
    2.无论是动态初始化创建的数组，还是静态初始化创建的数组，都是有长度的

 */
public class Demo01Array {
    public static void main(String[] args) {
        // 直接创建一个数组，里面存放int数字，分别是:5, 15, 25
        int[] arrayA = new int[] {5, 15, 25};

        // 创建一个数组，用来存放字符串："Hello","World","Java"
        String[] arrayB = new String[] {"Hello", "World", "Java"};

    }
}
