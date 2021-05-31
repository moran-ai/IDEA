package 复习.包装类;

/*
自动装箱和自动拆箱：
    基本数据类型和包装类之间可以互相转换
    JDK1.5之后出现的新特性

基本数据类型与字符串之间的转换
    基本数据类型 --> 字符串
    1.最常用的最简短的方法：基本数据类型的值 + ""
    2.包装类的静态方法toString(参数)，不是Object类的toString()方法
        static String toString(int i):返回一个表示指定整数的String对象
    3.String类的静态方法：valueOf(参数)
        static String valueOf(int i):返回int参数的字符串表示形式

    字符串 --> 基本数据类型
        使用包装类的静态方法parsexxx("数值类型的字符串")
            Integer:static int parseInt(String s)
            Double:static bouble parseDouble(String s)

装箱与拆箱：
    装箱：
        把基本数据类型的数据包装到包装类中，（基本数据类型 --> 包装类）
        构造方法：
            Integer(int value):构造一个新分配的Integer对象，表示指定的int值
            Integer(String value):构造一个新分配的Integer对象，表示参数String所指定的int值
            传递的字符串必须是基本数据类型，否则会抛出异常
        静态方法：
            String Integer valueOf(int value):返回一个表示指定int的 值得Integer的实例
            String Integer valueOf(String value):返回保存指定的String的值的Integer的对象
    拆箱：
        包装类 --> 基本数据类型
        成员方法:
            int intValue() 以int类型返回Integer的值
 */
public class recall_Integer {
    public static void main(String[] args) {
        // 基本数据类型 --> 字符串
        // 1.最常用的方法，基本数据类型后面+""
        int i = 10;
        String s1 = i + "";
        System.out.println(s1 + 200);
        System.out.println("==============================");
        // 2.包装类的静态方法toString(int i )
        String s2 = Integer.toString(20);
        System.out.println(s2);
        System.out.println("==============================");
        // String类的静态方法valueOf(int i )
        String s3 = String.valueOf(233);
        System.out.println(s3);
        System.out.println("==============================");
        // 字符串 -->基本数据类型
        int s4  = Integer.parseInt("34");
        System.out.println(s4);
        System.out.println("==============================");
        double s5 = Double.parseDouble("45.6");
        System.out.println(s5);
        System.out.println("==============================");

        // 装箱与拆箱
        // 构造方法
        Integer integer = new Integer(23);
        System.out.println(integer);
        System.out.println("==============================");
        Integer integer1 = new Integer("34");
        System.out.println(integer1);
        System.out.println("==============================");

        // 静态方法
        Integer integer2 = Integer.valueOf(23);
        System.out.println(integer2);
        System.out.println("==============================");
        Integer integer3 = Integer.valueOf("23");
        System.out.println("==============================");

        // 拆箱
        int e = Integer.valueOf(23);
        System.out.println(e);
    }
}
