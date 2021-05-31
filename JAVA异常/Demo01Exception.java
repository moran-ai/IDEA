package JAVA异常;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
java.lang.Throwable是所有错误和异常的超类
    Exception:编译期异常，进行编译(代码编写)java程序出现的问题
        RuntimeException:运行期异常，java程序运行过程中出现的问题
        异常就是程序出现了小毛病，把异常处理掉，程序就可以继续执行
    Error:错误
        错误就是程序出现了一个无法解决的问题，必须修改源代码，程序才能继续执行
 */
public class Demo01Exception {
    // Exception:编译期异常，进行编译(代码编写)java程序出现的问题
    // 方法一：throws ParseException抛出异常

    // public static void main(String[] args) /*throws ParseException*/{
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // 用来格式化日期

        // 方法二：采用try-catch方法处理异常
        Date date = null;  // 把字符串格式的日期，解析为Date格式的日期
        try {
            date = sdf.parse("19999-09-08");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
    */

        // RuntimeException:运行期异常，java程序运行过程中出现的问题
    /*
    public static void main(String[] args) {
        int [] array = {1,2,3};
        System.out.println(array[0]);
        try{
            // 可能出现异常的代码
            System.out.println(array[3]);
        }catch (Exception e){
            // 打印触发的异常
            System.out.println(e);
            // 异常的处理逻辑
            System.out.println(array[2]);
        }
    }
    */


    // Error 错误
    /*
    java.lang.OutOfMemoryError: Java heap space 内存溢出
    创建的数组过大，超出了jvm的内存使用范围
    程序出现错误，必须修改源代码
     */
    public static void main(String[] args) {
        // 创建一个动态数组
        int [] aray = new int[1024];
    }
}
