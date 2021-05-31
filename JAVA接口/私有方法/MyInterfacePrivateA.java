package JAVA接口.私有方法;

/*
需要抽取一个共有方法，用来解决两个默认方法之间重复代码的问题
这个共有方法不应该让实现类来使用，应该是私有化的

解决：从java9开始，允许定义私有方法
    1.普通私有方法：解决多个默认方法重复代码问题
       格式：
        private 返回值类型 方法名称(参数列表){
            方法体;
        }
    2.静态私有方法：解决多个静态方法重复代码问题
    格式：
        private static 返回值类型 方法名称(参数列表){
            方法体;
        }
 */
public interface MyInterfacePrivateA {
    public default void methodA(){
        System.out.println("默认方法1");
        methodCommend();
    }

    public default void methodB(){
        System.out.println("默认方法2");
        methodCommend();
    }

    private void methodCommend(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
