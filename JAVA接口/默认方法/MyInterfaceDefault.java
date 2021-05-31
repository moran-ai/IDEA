package JAVA接口.默认方法;

/*
从java8开始，允许使用默认方法
格式：
    public default 返回值类型 方法名称（参数列表）{
    方法体
    }
备注：接口中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    public abstract void mehtodAbs();

    // 新添加的默认方法
    public default void mehtodAbs2(){
        System.out.println("默认方法");
    }
}
