package JAVAfinal关键字.修饰成员变量;

/*
使用final关键字修饰成员变量，这个变量也是不可变的
注意：
1.由于成员变量具有默认值，使用了关键字final之后，必须手动赋值，不会有默认值
2.final修饰的成员变量，要么直接赋值，要么通过构造方法赋值,二者选一
3.必须保证类中所有重载的构造方法，都能对final进行赋值
 */
public class Person {
    private final String name;

    public Person(){
        name = "赵韩樱子";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
