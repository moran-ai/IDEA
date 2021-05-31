package JAVA接口.静态方法;

/*
从java8开始，接口当中允许定义静态方法
格式：
    public static 返回值类型 方法名称(){方法体}
提示：将abstract或者default换成static即可,带上方法体
 */
public interface MyInterfaceStatic {
    public static void methodStatic(){
        System.out.println("接口静态方法");
    }
}
