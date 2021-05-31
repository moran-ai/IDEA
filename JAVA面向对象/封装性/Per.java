package JAVA面向对象.封装性;

/*
当方法的局部变量和成员变量重名的时候，根据‘就近原则’，优先使用局部变量
如果需要访问本类中的成员变量，需要使用this关键字
格式：
    this.成员变量名

通过谁调用的方法，谁就是this
 */
public class Per {
    String name; // 名字


    public void sayHello(String name){
        System.out.println(name + ", 你好。我是" + this.name);
    }
}
