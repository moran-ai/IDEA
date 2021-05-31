package 复习.recall_System类;

import java.util.Arrays;

/*
java.lang.System中提供了大量的静态方法，可以获取系统的相关信息或者系统级操作]
成员方法：
    public static long CurrentTimeMills():返回以毫秒值为单位的当前时间
    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    将数组指定的元素复制到另一个数组
    参数：
        1.Obejct src:源数组
        2.int srcPos:源数组的起始位置
        3.Objest dest:目标数组
        4.int destPos:目标数组的起始位置
        5.int length:要复制元素的数量
 */
public class recall_System {
    public static void main(String[] args) {
        demo1();
    }

    // System.arraycopy()方法
    public static void demo(){
        int ser[] = {1, 2, 3, 4, 5};
        int len[] = {6, 7, 8, 9, 10};

        // 将ser数组的元素复制到len数组
        System.out.println("复制前：" + Arrays.toString(ser));
        System.arraycopy(ser, 0, len, 0, 4);
        System.out.println("复制后：" + Arrays.toString(len));
    }

    // System.CurrentTimeMills()方法
    public static void demo1(){
        System.out.println(System.currentTimeMillis());
    }
}
