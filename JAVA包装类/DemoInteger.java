package JAVA包装类;

/*
    装箱：把基本类型的数据，包装到包装类中（基本数据类型->包装类）
        构造方法：
            Integer(int value) 构造一个新分配的Integer对象，表示指定的int值
            Integer(String s) 构造一个新分配的Integer对象，表示参数String所指定的int值
                传递的字符串，必须是基本数据类型的字符串，否则会抛出异常
         静态方法：
            static Integer valueOf(int i ) 返回一个表示指定的int值的Integer实例
            static Integer valueOf(String s) 返回保存指定的String的值的Integer对象

     拆箱:在包装类中取出基本类型的数据（包装类->基本数据类型）
        成员方法：
            int intValue()以int类型返回Integer的值
 */
public class DemoInteger {
    public static void main(String[] args) {
        // 装箱
        // 构造方法
        Integer ln1 = new Integer(1);
        System.out.println(ln1);  // 重写了toString方法

        Integer ln2 = new Integer("1");
        System.out.println(ln2);
        System.out.println("==================");
        // 静态方法
        Integer ln3 = Integer.valueOf(1);
        System.out.println(ln3);

        Integer ln4 = Integer.valueOf("1");
        System.out.println(ln4);
        System.out.println("============");

        // 拆箱
        int i = ln1.intValue();
        System.out.println(i);
    }
}
