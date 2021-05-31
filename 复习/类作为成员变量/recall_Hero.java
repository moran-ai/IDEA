package 复习.类作为成员变量;

import JAVA内部类.概念与分类.类作为成员变量.Weapon;

public class recall_Hero {
    private String name; // 人物名
    private int age;  // 人物年龄
    private Weapon weapon;  // 武器名
    private recall_people recall_people; // 人物名

    // 无参数的构造方法
    public recall_Hero(){

    }

    // 有参数的构造方法
    public recall_Hero(String name, int age, Weapon weapon, recall_people recall_people){
        this.name = name;
        this.age = age;
        this.weapon = weapon;
        this.recall_people = recall_people;
    }

    public void attack(){
        System.out.println("年龄为：" + age
                + "的" + name + "正在使用" +
                weapon.getCode() + "攻击" + recall_people.getName());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age =age;
    }

    public int getAge(){
        return age;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    public void setRecall_people(recall_people recall_people){
        this.recall_people = recall_people;
    }

    public recall_people getRecall_people(){
        return recall_people;
    }

}
