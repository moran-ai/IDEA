package JAVA关键字static;

public class Student {
    // static关键字修饰成员变量
    private int id;  // 学号
    private String name;  // 姓名
    private int age;  // 年龄
    static String room;  // 教室
    private static int idCounter = 0; // 学号计数器，每当创建一个新对象，idCounter++

    public Student(){
        idCounter++;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
