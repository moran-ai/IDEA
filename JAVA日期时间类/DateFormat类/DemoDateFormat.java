package JAVA日期时间类.DateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.text.DateFormat:是日期/时间格式化子类的抽象类
    作用：
        格式化：日期 --> 文本
        解析： 文本 --> 日期
     成员方法：
        String format(Date date):按照指定的模式，把Date日期格式化为符合模式的字符串
        Date parse(String source) 把符合模式的字符串，解析为Date日期

     DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormate的子类
     java.text.SimpleDateFormat extends DateFormat

     构造方法：
        SimpleDateFormat(String pattern)
            用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
        参数：
            String pattern:传递指定的模式
         模式:区分大小写
         y      年
         M      月
         d      日
         H      时
         m      分
         s      秒
       写对应的模式，会把模式替换为对应的日期和时间
       注意：模式中的字母不能更改，连接模式的符号可以改变
 */
public class DemoDateFormat {
    public static void main(String[] args) throws ParseException{
        demo2();
    }

    /*
        使用DateForamt中的parse方法解析日期，把文本解析为日期
        使用步骤:
            1.创建SimpleDateFormat对象， 构造方法中传入指定的模式
            2.调用SimpleDateFormat对象中的parse方法，把符合模式的字符串，解析为日期
        注意：
            public Date Parse(String source) throws ParseException
            parse方法声明了一个异常 ParseException(解析异常)
            如果字符串和构造方法的模式不一样，就会抛出此异常
            调用了一个抛出异常的方法，就必须处理这个异常，要么throws，要么try-catch

     */
    private static void demo2() throws ParseException {
        // 创建SimpleDateFormat对象， 构造方法中传入指定的模式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分55秒");

        // 调用SimpleDateFormat对象中的parse方法，把符合模式的字符串，解析为日期
        Date d = simpleDateFormat.parse("2020年07月27日 16时38分55秒");
        System.out.println(d);
    }

    /*
        使用DateFormat类中的方法format，把日期格式化为字符串
        使用步骤：
            1.创建SimpleDateFormat对象，构造方法中传递指定的模式
            2.调用SImpleDateFormat对象中的方法format,按照构造方法中的模式，把日期转换为字符串
     */
    public static void demo1(){
        // 创建SimpleDateFormate对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分55秒");
        Date date = new Date();
        // String format(Date date):按照指定的模式，把Date日期格式化为符合模式的字符串
        String s = simpleDateFormat.format(date);
        System.out.println(date); // Mon Jul 27 16:38:09 CST 2020
        System.out.println(s);  // 2020年07月27日 16时38分55秒
    }
}
