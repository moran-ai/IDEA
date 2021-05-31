package JAVA接口.多继承;

public interface MyInterfaceA {
    public abstract void mehtodA();
    public abstract void methodCommend();
    public default void methodDefault(){
        System.out.println("默认方法");
    }
}
