package 复习.集合;

// 对集合进行排序必须实现Comparable接口，重写compareTo()方法
public class People implements Comparable<People>{
    // 成员变量
    private String name;  // 姓名
    private int age;     // 年龄
    private String weight;   // 体重
    private String height;   // 身高
    private String sex;     // 性别
    private String vocation; // 职业

    // 空参数的构造方法
    public People(){

    }

    // 带参数的构造方法
    public People(String name, int age, String weight, String height, String sex, String vocation){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.vocation = vocation;
    }

    // 重写toString()方法
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", sex='" + sex + '\'' +
                ", vocation='" + vocation + '\'' +
                '}';
    }

    // 重写compareTo()方法


    @Override
    public int compareTo(People o) {
        return this.getAge() - o.getAge();  // 升序排列
    }

    // 成员方法 get和set
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation;
    }
}
