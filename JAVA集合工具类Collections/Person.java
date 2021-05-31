package JAVA集合工具类Collections;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // 重写toString()方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    重写排序的规则
     */
    @Override
    public int compareTo(Person o) {
      //  return 0; // 认为元素是相同的
        // 自定义比较的规则，比较两个人的年龄(this,参数Person)
        return this.getAge() - o.getAge(); // 年龄升序排序

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

