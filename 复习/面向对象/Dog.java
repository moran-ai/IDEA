package 复习.面向对象;

public class Dog {
    private String name;
    private int age;
    private String weight;
    private String height;

    // 空参数构造方法
    public Dog(){

    }

    // 有参数构造方法
    public Dog(String name, int age, String weight, String height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // 构造get和set方法
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
        this.height = height;
    }

    public String getHeight(){
        return height;
    }
}
