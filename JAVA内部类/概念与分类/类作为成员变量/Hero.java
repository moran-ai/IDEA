package JAVA内部类.概念与分类.类作为成员变量;

public class Hero {
    private String name; // 英雄名
    private int age;
    private Weapon weapon;  // 武器名

    public Hero(){

    }

    public void attack(){
        System.out.println("年龄为" + age + "的" + name + "用" + weapon.getCode() + "攻击灵狐.");
    }

    public Hero(String name, int age, Weapon weapon){
        this.name = name;
        this.age = age;
        this.weapon = weapon;
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

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }
}
