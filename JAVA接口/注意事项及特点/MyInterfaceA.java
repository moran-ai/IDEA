package JAVA接口.注意事项及特点;

public interface MyInterfaceA {
    public abstract void methodA();

    public abstract void methodAbs();

    public default void method(){
        System.out.println("默认方法A");
    }
}
