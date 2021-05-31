package JAVA接口.多继承;

/*
子接口中有：mehtodA(),methodB(),mehtodCommend(),method()四个方法
 */
public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    public default void methodDefault(){

    }
}
