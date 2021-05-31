package 复习.Map集合;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String weight;
    private String height;

    // 无参数构造方法
    public Student(){

    }

    // 有参数构造方法
    public Student(String name, int age, String height, String weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    // 重写equals方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(weight, student.weight) &&
                Objects.equals(height, student.height);
    }

    // 重写hashCode()方法
    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, height);
    }

    // 重写toString()方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    // get和set
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

    public void setWeight(String weight){
        this.weight = weight;
    }

    public String getWeight(){
        return weight;
    }

    public void setHeight(String height){
        this.weight = weight;
    }

    public String getHeight(){
        return height;
    }
}
