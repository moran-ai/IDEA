package JAVA接口.多继承;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommend();
    public default void methodDefault(){
        System.out.println("默认方法B");
    }
}
