package JAVAObject类;

import java.util.ArrayList;

public class DemoEquals {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj) 指示其他某个对象是否与此对象”相等“
        equals方法源码：
            public boolean equals(Object obj){
            return (this == obj);
            }
            参数：
                Object obj:可以传递任意的参数
                ==:比较运算符，返回的是一个布尔值
                基本数据类型：比较的是值
                引用数据类型：比较是两个对象的地址值

         */
        Person person = new Person("赵丽颖", 20);
        Person per = new Person("小爱同学", 20);
       //  System.out.println(person.equals(per));  // 返回的是布尔值

        ArrayList<String> lsit = new ArrayList<>();

        boolean b = person.equals(person);
        System.out.println(b);
    }
}

