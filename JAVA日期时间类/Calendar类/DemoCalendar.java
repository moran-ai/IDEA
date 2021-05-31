package JAVA日期时间类.Calendar类;

import java.util.Calendar;

/*
    java.util.Calendar 日历类
    Calendar是一个抽象类，里面提供了很多操作日历的方法（YEAR,MONTH,DAY_OF_MONTH,HOUR）
    Calendar类无法直接创建对象，里面有个一个静态方法getInstance(),该方法返回Calendar的子类
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历
 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();  // 多态
        System.out.println(calendar);
    }
}
