package JAVA集合框架.迭代器;

import java.util.ArrayList;

/*
    增强型for循环:底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写，是JDK1.5之后出现的特性
    Collection<E> extends Iterator<E>：所有的单列集合都可以使用增强型for循环
    public interface Iterator<T>:实现这个接口允许对象成为"foreach"语句的目标

    增强for循环:用来遍历集合和数组
    格式：
        for (集合/数组的数据类型 变量名 : 集合名/数组名){
            sout(变量名);
            }
 */
public class DemoForeach {
    public static void main(String[] args) {
        demo02();
    }

    /*
    使用增强型for循环遍历集合
     */
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("22");
        list.add("333");
        list.add("4444");

        for(String l : list){
            System.out.println(l);
        }
    }

    /*
    使用增强型for循环来遍历数组
     */
    public static void demo01(){
        int [] array = {1, 2, 3, 4, 5};
        for (int i : array){
            System.out.println(i);
        }
    }
}
