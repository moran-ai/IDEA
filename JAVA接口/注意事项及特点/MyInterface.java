package JAVA接口.注意事项及特点;

public interface MyInterface {
    public default void method(){
        System.out.println("接口的默认方法");
    }
}
