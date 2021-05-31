package JAVA接口.常量;

/*
接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字修饰
这就是接口的【常量】
格式：
    public static final 数据类型 常量名称 = 数据值;
    public static final 这三个关键字可以省略
注意：
    1.使用final关键字进行修饰，说明不可变
    2.接口当中的常量，必须进行赋值，不能不赋值
    3.接口中常量名称必须完全大写，并用下划线隔开
 */
public interface MyInterfaceConst {
    // 常量,赋值就不可以改变
    public static final int NUM_OF_MY_CLASS = 10;

}
