package JAVASystem类;

import java.util.Arrays;

/*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作
    常用的方法有：
        public static long CurrentTimeMills():返回以毫秒值单位的当前的时间
        publci static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        将数组指定的数据拷贝到另一个数组中
 */
public class Demo01System {
    public static void main(String[] args) {
        demo02();
    }

    /*
    publci static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        将数组指定的数据拷贝到另一个数组中

     参数：
        src :源数组
        srcPos：源数组的起始位置(起始索引)
        dest:目标数组
        destPos:目标数组的起始位置
        length:要复制数组元素的数量
     */
    private static void demo02() {
        /*
        将src数组中的前3个元素，复制到dest数组的前3个位置上复制元素前；
        src数组元素[1,2,3,4,5],dest数组元素[6,7,8,9,10]
        复制元素后；
            src数组元素[1,2,3,4,5],dest数组元素[1,2,3,9,10]
         */
        // 定义源数组
        int src[] = {1,2,3,4,5};

        // 定义目标数组
        int dest[] = {6,7,8,9,10};
        System.out.println("复制前：" + Arrays.toString(dest));
        // 使用System中的arraycopy的方法把源数组的前3个元素复制到目标数组的前3个位置上
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("复制后：" + Arrays.toString(dest));
    }

    /*
    java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作
    用来测试程序的效率
     */
    private static void demo01() {
        /*
        验证for循环打印数字1-9999所需要使用的时间（毫秒）

         */

        // 程序执行前，获取一次毫秒值
        long s = System.currentTimeMillis();

        // for循环
        for (int i = 1; i <= 9999; i++){
            System.out.println(i);
        }

        // 程序执行后，再次获取毫秒值
        long r = System.currentTimeMillis();

        System.out.println("程序共耗时" + (r-s) + "毫秒");
    }
}
