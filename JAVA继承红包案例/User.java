package JAVA继承红包案例;

public class User {
    private String name; // 姓名
    private int money; // 当前用户的余额

    public User(){

    }

    public User(String name, int money){
        this.name = name;
        this.money = money;
    }

    // 定义一个方法，显示用户的钱数
    public void show(){
        System.out.println("用户名：" + name + "，剩余余额有：" + money + "元.");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }
}
