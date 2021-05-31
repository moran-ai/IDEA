package JAVA抽象;

/*
抽象类注意事项：
    1.抽象类不能直接创建对象，只能创建非抽象类的子类对象
    2.抽象类中可以有构造方法，供子类创建对象时，初始化父类成员
    3.抽象类中不一定包含抽象方法，有抽象方法的一定是抽象类 ,没有抽象方法的抽象类，也不能直接创建对象
    4.抽象类的子类，必须重写父类中的所有抽象方法，去掉关键字abstract,将大括号补齐
 */
public class Zi extends Fu {
    public Zi(){
        // super();
        System.out.println("子类");
    }

    @Override
    public void eat(){
        System.out.println("吃饭");
    }
}
