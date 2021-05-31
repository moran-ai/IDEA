package JAVA异常;

/*
异常产生的过程解析(分析异常是如何产生的，怎样解决异常)

 */
public class Demo02Exception {
    public static void main(String[] args) {
        // 创建int类型的数组
        int [] array = {1, 2, 3};
        int e = getElement(array,1);
        System.out.println(e);
    }

    /*
    定义一个方法，获取数组指定位置的索引
    参数：int [] arr,int index
    java.lang.ArrayIndexOutOfBoundsException 索引越界异常
    访问数组中的3索引，但是数组中并没有3索引，jvm就会监测出程序出现了异常：
    JVM会做两件事：
        1.JVM会根据异常产生的原因创建一个异常对象，这个异常对象包含了异常产生的（内容，原因，位置）
            new ArrayIndexOutOfBoundsException("3")
        2.在getElement方法中，没有异常的处理逻辑(try-catch),那么JVM就会把异常对象抛出给方法的调用者，
        main方法来处理这个异常

    main方法接收到了这个异常对象，但是main方法也没有异常处理逻辑，继续把异常对象抛出给main方法的调用者JVM处理
    JVM接收到了这个异常对象，做了两件事：
        1.把异常对象（内容，原因，位置）以红色的字体打印在控制台
        2.JVM会终止当前正在执行的java程序-->中断处理
     */
    public static int getElement(int [] arr, int index){
        int ele = arr[index];
        return ele;
    }

}
