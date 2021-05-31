package 复习;

public class Cat {
    // 成员变量
    private String name;
    private int age;
    private String weigth;
    private String height;

    // 构造一个空的构造方法
    public Cat(){

    }

    // 构造一个有参数的构造方法
    public Cat(String name, int age, String weigth, String height){
        this.name = name;
        this.age = age;
        this.weigth = weigth;
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

    public void setWeigth(String weigth){
        this.weigth = weigth;
    }

    public String getWeigth(){
        return weigth;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public String getHeight(){
        return height;
    }
}
