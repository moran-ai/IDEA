package JAVA日期时间类.Date类;

import java.util.Date;

public class Demo01Date {
    public static void main(String[] args) {
        //Demo01();
        Demo03();
    }

    /*
    Date的成员方法
    long gettime():将日期转换为毫秒值(相当于System.currentTimeMillis())
        返回1970年1月1日00:00:00 GMT以来此Date对象的毫秒数.
     */
    private static void Demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time); // 1595837529362
    }

    /*
    Date()类的空参数构造方法
    Date()获取当前系统的日期和时间
     */
    public static void Demo01(){
        Date date = new Date();
        System.out.println(date);
    }

    /*
    Date类的有参数构造方法
    Date(long date):传递毫秒值，把毫秒值转换为Date日期
     */

    public static void Demo02(){
        Date date = new Date(0L);
        System.out.println(date);  // Thu Jan 01 08:00:00 CST 1970
    }
}
