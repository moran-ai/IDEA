package JAVAScanner和API使用;

public class Per {
    private String name;
    private int age;

    // 无参数的构造方法
    public Per() {
    }

    // 有参数的构造方法
    public Per(String name, int age){
        this.name = name;
        this.age = age;
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
