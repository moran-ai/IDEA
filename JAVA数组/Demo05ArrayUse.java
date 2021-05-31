package JAVA数组;

/*
使用动态初始化数组时，其中的元素会自动拥有一个默认值，规则如下：
    1.如果是整数类型，默认为0
    2.如果是浮点类型,默认为0.0
    3.如果是字符类型，默认为'\u0000'
    4.如果是布尔类型，默认为false
    5.如果是引用数据类型，默认为null

注意事项：
    静态初始化其实也有默认值，不过系统自动马上将默认值替换成了大括号当中的具体值
 */
public class Demo05ArrayUse {
    public static void main(String[] args) {
        // 动态初始化一个数组
        int[] array = new int[3];

        // 索引访问数组中的元素
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println("==============");

        // 将数字123赋值交给1号元素
        array[1] = 123;
        System.out.println(array[1]);

    }
}
