package JAVA面向对象.封装性;

/*
对于基本数据类型当中的boolean类型，其getxxx要写成isxx的形式
 */
public class Student {
    // 成员变量
    private String name;
    private int age;
    private boolean male;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if (a <100 && a >=0){
            age = a;
        }else {
            System.out.println("数据不合理！！！");
        }

    }

    public int getAge(){
        return age;
    }

    public void setMale(boolean b){
        male = b;
    }

    public boolean isMale(){
        return male;
    }

}
