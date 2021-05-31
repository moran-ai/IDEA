package JAVA包装类;

import java.util.ArrayList;

/*
    自动装箱与自动拆箱：基本类型的数据和包装类之间可以自动的相互转换
    JDK1.5之后出现的新特性
 */

public class Demo01Interger {
    public static void main(String[] args) {
        /*
        自动装箱：直接把int类型的数据直接赋值给包装类
        Integer i = 1; 等价于Integer i = new Integer(1);
         */
        Integer i = 1;

        /*
        自动拆箱:i是包装类，无法直接参与运算，可以自动转换为基本数据类型，再进行计算
        i = i + 2; 等价于 i = i.intValue() + 2;
        i = i.intValue() + 2 = 3 自动装箱
         */
        i = i + 2;

        ArrayList<Integer> list = new ArrayList<>();
        /*
        ArrayList无法直接存储整数，可以存储包装类
         */
        list.add(1);  // 自动装箱 list.add(new Integer(1))
        list.get(0); // 自动拆箱 list.get(0).intValue()
    }
}
