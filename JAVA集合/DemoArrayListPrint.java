package JAVA集合;

import java.util.ArrayList;

/*
定义以指定格式打印集合的方法(ArrayList作为参数)，使用{}括起来，使用@分隔每个元素
 */
public class DemoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayPrint(list);
//        System.out.println(list);
    }

    public static void ArrayPrint(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            System.out.print(n + "@");

            // 如果是最后一个，后面跟的是"}"
            if (i == list.size()-1){
                System.out.println("}");
            }
        }
    }
}
