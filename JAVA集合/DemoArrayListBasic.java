package JAVA集合;

import java.util.ArrayList;

/*
如果要向集合中存储基本数据类型，需要使用基本数据类型对应的“包装类”
基本类型  包装类 （引用类型 包装类位于java.lang下）
byte        Byte
short       Short
int         Integer 【特殊】
long        Long
float       Float
double      Double
char        Character  【特殊】
boolean     Boolean
从JDK1.5+开始，支持自动装箱，自动拆箱
自动装箱：基本类型->包装类型
自动拆箱：包装类型->基本类型
 */

public class DemoArrayListBasic {
    public static void main(String[] args) {
       // ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        Integer num = list.get(1);
        System.out.println("取出来的元素是：" + num);

        Integer rem = list.remove(2);
        System.out.println("删除的元素是：" + rem);
        System.out.println(list);
    }
}
