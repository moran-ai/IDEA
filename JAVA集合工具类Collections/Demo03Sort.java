package JAVA集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作
    方法：
        public static <T> void sort(List<T>, list, Comparator<? super T>):将集合中元素按照规则排序

    Comparator与Comparable的区别：
        Comparable:this（自己）和别人（参数）比较，需要实现Comparable接口，重写比较的规则compareTo方法
        Comparator:用第三方(比较器)来进行比较两个对象

    Comparator排序规则：
        o1-o2：升序

 */
public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            // 重写比较的规则compare
            @Override
            public int compare(Integer o1, Integer o2) {
              //  return o1 - o2;  // 升序
                return o2 - o1;  // 降序
            }
        });
        System.out.println(list01);

        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("a小网", 30));
        list02.add(new Student("小李", 20));
        list02.add(new Student("b小张", 30));
        list02.add(new Student("小力", 29));
        System.out.println(list02);

        Collections.sort(list02, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄升序排序
                int result =  o1.getAge() - o2.getAge();

                // 如果两个人年龄相同，使用姓名的第一个字比较
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list02);
    }
}
