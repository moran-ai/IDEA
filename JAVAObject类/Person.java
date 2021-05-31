package JAVAObject类;

import java.util.Objects;

public class Person {
    private  String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
    Object类的equals方法默认比较的是两个对象的地址值,没有意义
    重写equals方法，比较两个对象的属性(name,age)
    问题：
        隐含着一个多态
        多态的弊端：无法使用子类
        Object obj = per = new Person("小爱同学", 20);
     解决：
        对象向下转型,把参数obj的类型改为Person

     */

    // 重写equals方法
    @Override
    public boolean equals(Object obj){
        // 如果传递的参数是this本身，直接返回true,提高程序效率
        if (obj == this){
            return true;
        }

        // 判断传递的参数是null，直接返回false,提高程序效率
        if(obj == null){
            return false;
        }

        // 判断是否是指定的类型
        if (obj instanceof Person){
            // 对象向下转型，把obj转换为Person类型
            Person person = (Person) obj;

            // 比较两个对象的属性
            boolean b = this.name.equals(person.name) && this.age == age;
            return b;
        }

        // 不是Person类型
        return false;

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}
