package JAVA多态.成员方法使用特点;

public class Fu {
    int num = 10;

    public void show(){
        System.out.println(num);
    }

    public void method(){
        System.out.println("父类方法");
    }

    public void methodFu(){
        System.out.println("父类特有方法");
    }
}
