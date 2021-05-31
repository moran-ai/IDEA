package JAVA面向对象.封装性;

/*
问题：定义类Person年龄时，无法组织不合理的数值被设置
解决：用private关键字将需要保护的成员变量进行修饰
使用了关键字private，那么本类当中仍然可以访问，但是，超出了本类范围就不能直接访问

间接访问成员变量，就是定义一对get/set方法
对于get，不能有参数，有返回值,返回值类型和成员变量类型对应
对于set，没有返回值,参数类型和成员变量对应
 */
public class Person {
    // 成员变量
    String name;
    private int age;

    // 成员方法
    public void show(){
        System.out.println("我叫" + name + ", 年龄" + age);
    }

    // 这个成员方法专门用于设置age数据
    public void setAge(int num){
        if (num < 100 && num >=0){
            age = num;
        } else {
            System.out.println("数据不合理!!!");
        }

    }

    // 这个成员方法专门用于获取age数据
    public int getAge(){
        return age;
    }
}
