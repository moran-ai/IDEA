package JAVA异常.Try_Catch捕获异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
try...catch:异常处理的第二种方式，自己处理异常
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        异常的处理逻辑，产生异常对象后，如何处理异常对象
        在工作中，会把异常信息记录到日志中
    }
    ...
    catch(异常类名 变量名){

    } 可以有多个

注意事项：
    1.try中可能会抛出多个异常对象，可以使用多个catch来处理这些异常对象
    2.如果try中产生了异常，就会执行catch中的异常处理逻辑，执行完catch后，继续执行try-catch后的语句
        如果try中没有异常，就不执行catch中的语句，执行完try语句后，继续执行try-catch后的语句

 */
public class DemoTryCatch {
    public static void main(String[] args) {
        try{
            readFiel("C:\\a.tx");
        } catch (IOException e){ // try抛出什么异常对象，catch中就定义什么异常变量，用来接收这个异常对象
            //System.out.println("catch--文件的后缀名不对");
            /*
            Throwable类中定义了3个异常处理的方法
            String getMessage() 返回throwable的简短描述
            String toString() 返回throwable的详细字符串
            void printStackTrace() JVM打印异常对象，默认此方法，打印异常信息最全面
             */
          //  System.out.println(e.getMessage());  // 文件路径不是C:\a.txt
          //  System.out.println(e.toString());  // java.io.IOException: 文件路径不是C:\a.txt
           e.printStackTrace();
        }
    }

    /*
        如果传递的路径不是C:\\a.txt，就抛出文件找不到异常，告诉方法调用者，文件路径不对
         */
    public static void readFiel(String filename) throws IOException {
        if (!filename.equals("C:\\a.txt")){
            throw new IOException("文件路径不是C:\\a.txt");
        }
    }
}
