package JAVA面向对象.封装性;

/*
构造方法是专门用来创建对象的方法，当通过关键字new来创建对象时，其实就是在调用构造方法
格式：
    public 类名称(参数类型 参数名称){
        方法体;
    }

注意事项：
    1.构造方法的名称必须和所在的类名称完全一样，就连大小写也要一样
    2.构造方法不需要返回值类型，连void都不写
    3.构造方法不能return一个具体的返回值
    4.如果没有编写任何构造方法，那么编译器会自动赠送一个构造方法，没有参数，方法体什么也不做
    5.一旦编写了至少一个构造方法，那么编译器将不再赠送
    6.构造方法也是可以进行重载的
 */
public class Stu {
    // 成员变量
    private String name;
    private int age;

    // 全参数构造方法
    public Stu(String name, int age){
        System.out.println("全参构造方法执行!");
        this.name = name;
        this.age = age;
    }

    // 无参数的构造方法
    public Stu(){
        System.out.println("无参方法执行！");
    }

    // setName
    public void setName(String name){
        this.name = name;
    }

    // getName
    public String getName(){
        return name;
    }

    // setAge
    public void setAge(int age){
        if (age >=0 && age<100){
            this.age = age;
        } else {
            System.out.println("数据不合理！");
        }

    }

    // getAge
    public int getAge(){
        return age;
    }

}
