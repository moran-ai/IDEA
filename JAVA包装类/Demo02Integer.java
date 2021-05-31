package JAVA包装类;

/*
    基本数据类型与字符串之间的转换
    基本类型 -> 字符串(String)
        1.基本类型数据的值+"" 最简单的方法(常用)
        2.包装类的静态方法toString(参数),不是Object类的toString方法
            statitc String toString(int i ) 返回一个表示指定整数的String对象
        3.String类的静态方法valueOf(参数)
            static String valueOf(int i ) 返回int参数的字符串表示形式

    字符串->基本数据类型
        使用包装类的静态方法parsexxx("数值类型的字符串")
            Integer类：static int parseInt(String s)
            Double类 : static double parseDouble(String s)
 */
public class Demo02Integer {
    public static void main(String[] args) {
        // 基本类型 -> 字符串(String)
        // 1.基本类型数据的值+"" 最简单的方法(常用)
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1 + 200);  // 100200

        // 2.包装类的静态方法toString(参数)
        String s2 = Integer.toString(500);
        System.out.println(s2 + 200); // 500200

        // 3.String类的静态方法valueOf(参数)
        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        System.out.println("=================");

        // 字符串->基本数据类型
        int i  = Integer.parseInt(s1);
        System.out.println(i);

    }
}
