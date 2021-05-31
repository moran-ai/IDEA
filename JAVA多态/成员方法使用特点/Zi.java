package JAVA多态.成员方法使用特点;

//import JAVA多态.成员变量使用特点.Fu;

public class Zi extends Fu {
    int num = 20;
    @Override
    public void show(){
        System.out.println(num);
    }

    @Override
    public void method(){
        System.out.println("子类方法");
    }

    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
