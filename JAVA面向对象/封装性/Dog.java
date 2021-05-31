package JAVA面向对象.封装性;

/*
标准的类
 */
public class Dog {
    // 成员变量
    private String name;
    private int age;

    // 无参数的构造方法
    public Dog(){

    }

    // 有参数的构造方法
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 构造set和get方法
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
