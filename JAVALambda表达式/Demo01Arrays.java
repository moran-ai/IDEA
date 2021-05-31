package JAVALambda表达式;

import java.util.Arrays;
import java.util.Comparator;

/*
    lambda表达式有参数有返回的练习
    需求：
        1.使用数组存储多个Person对象
        2.对数组中的Person对象使用Arrays的sort()方法通过年龄进行升序排序

 */
public class Demo01Arrays {
    public static void main(String[] args) {
        // 使用数组存储多个Person对象
        Person arr[] = {
                new Person("马化腾", 34),
                new Person("马云", 64),
                new Person("马机", 54)
        };

        // 2.对数组中的Person对象使用Arrays的sort()方法通过年龄进行升序排序
//        Arrays.sort(arr, new Comparator<Person>(){
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();  // 升序
//            }
//        });

        // 使用lambda简化匿名内部类
        Arrays.sort(arr, (Person o1, Person o2) ->{
            return o1.getAge() - o2.getAge();
        });

        // (参数列表):括号中参数列表的数据类型，可以省略不写
//        {重写接口方法的代码}:如果{}中的代码只有一行。无论是否有返回值，都可以省略({},return,分号)
//        注意事项：
//        {},return,分号必须一起省略
        Arrays.sort(arr, (o1, o2) -> o1.getAge() - o2.getAge());

        // 遍历数组
        for(Person p : arr){
            System.out.println(p);
        }
    }
}
