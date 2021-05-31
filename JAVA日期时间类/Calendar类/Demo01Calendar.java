package JAVA日期时间类.Calendar类;

import java.util.Calendar;
import java.util.Date;

/*
Calendar类的常用成员方法：
    public int get(int field):返回给定日历字段的值
    public int set(int field, int value):将给定的日历字段设置为给定值
    public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去给定的时间量
    public Date getTime():返回一个表示此Calendar时间值(从历元到现代的毫秒值偏移量）的Date对象

    成员方法的参数:
        int field :日历类的字段，可以使用Calendar类的静态成员变量获取
            public static final int YEAR = 1; 年
            public static final int MONTH = 2; 月
            public static final int DATE = 5; 月中的某一天
            public static final int DAY_OF_MONTH = 5; 月中的某一天
            public static final int HOUR = 10; 时
            public static final int MINUTE = 12; 分
            public static final int SECOND = 13; 秒

 */
public class Demo01Calendar {
    public static void main(String[] args) {
        demo04();
    }

    /*
    public Date getTime():返回一个表示此Calendar时间值(从历元到现代的毫秒值偏移量）的Date对象
    把日历对象转换为日期对象
     */
    private static void demo04() {
        // 使用getInstance()方法，获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);
    }

    /*
    public abstract void add(int field, int amount):根据日历的规则，为给定的日历字段添加或减去给定的时间量
    把指定的字段增加或减少指定的值
    参数：
        int field:传递指定的日历字段（YEAN,MONTH..)
        int amount:增加或减少指定的值
            正数：增加
            负数：减少
     */

    /*
    public int set(int field, int value):将给定的日历字段设置为给定值
    参数:
        传递指定的日历字段
        int value：给指定字段设定值

     */
    private static void demo03() {
        // 使用getInstance()方法，获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        // 年增加两年
        calendar.add(Calendar.YEAR, 2);
        int y = calendar.get(Calendar.YEAR);
        System.out.println(y);  // 返回年份

        // 月份减少3个月
        calendar.add(Calendar.MONTH, -3);
        int m = calendar.get(calendar.MONTH);
        System.out.println(m);

        // 设置年为9999
        calendar.set(Calendar.YEAR, 9999);

        // 设置月为9月
        calendar.set(Calendar.MONTH, 9);

        // 设置日为9日
        calendar.set(Calendar.DAY_OF_MONTH, 9);

        // 同时设置年月日,使用set方法的重载形式
        calendar.set(8888, 8, 8);

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);  // 返回年份

        int month = calendar.get(Calendar.MONDAY);
        System.out.println(month);  // 西方的月份是0-11,东方是1-12

        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);  // 返回当前月的第多少天
    }

    /*
    public int get(int field):返回给定日历字段的值
    参数：传递指定的日历字段（YEAR,MONTH...)
    返回值：日历字段代表具体的值
     */
    public static void Demo01(){
        // 使用getInstance()方法，获取Calendar对象
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);  // 返回年份

        int month = calendar.get(Calendar.MONDAY);
        System.out.println(month);  // 西方的月份是0-11,东方是1-12

        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);  // 返回当前月的第多少天

    }
}
