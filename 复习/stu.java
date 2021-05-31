package 复习;

public class stu {
    // 成员变量
    private String name;
    private int age;

    // 构造无参数方法
    public stu() {
    }

    // 构造有参数方法
    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 构造get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
