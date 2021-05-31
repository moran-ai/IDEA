package JAVA异常.throws关键字;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws关键字是异常处理的第一种方式，交给别人处理
作用：
    当方法内部抛出异常对象时，就必须处理这个异常对象
    可以使用throws关键字进行异常处理，把异常对象声明抛出交给方法的调用者（自己不处理），最终交给JVM处理->中断
使用格式：
    修饰符 返回值类型 方法名（参数列表） throws AAAException,BBBException{
        throw new AAAException("产生的原因");
        throw new BBBException("产生的原因");
        }
注意:
    1.throws关键字必须写在方法声明处
    2.throws关键字后面声明的异常必须是Exception类或者Exception类的子类
    3.方法内部如果抛出了多个异常，throws关键字后面也必须声明多个异常
        如果抛出的多个异常有父子类关系，那么直接声明父类异常即可
    4.调用了一个声明抛出异常的方法，就必须处理这个异常
        继续使用thorws关键字声明抛出，交给方面的调用者，最终交给JVM
        或者使用try-catch
 */
public class Demo01Throws {
    /*
    注意：
        FileNotFoundException类是IOException类的子类，直接声明Exception（父类）即可
        FileNotFoundException extends IOException extends Exception
     */
   // public static void main(String[] args) throws FileNotFoundException, IOException{
   // public static void main(String[] args) throws IOException{
    public static void main(String[] args) throws Exception{
        readFile("C:\\a.txt");
    }

    /*
    定义一个方法，对传递的文件路径进行合法性的判断
    如果路径不是c:\\a.txt,那么就抛出文件找不到异常，告诉方法的带调用者
    注意:
        FileNotFoundException是编译异常，需要处理
        可以使用throws继续声明FileNotFoundException这个异常对象，让方法的调用者处理
     */

   // public static void readFile(String filename) throws FileNotFoundException, IOException{
  //  public static void readFile(String filename) throws IOException{
    public static void readFile(String filename) throws Exception{
        /*
        如果传递的路径不是以.txt结尾，就抛出IO异常，告诉方法调用者，文件的后缀名不对
         */
        if(!filename.endsWith(".txt")){
            throw new IOException("文件后缀名错误");
        }

        /*
        如果传递的路径不是C:\\a.txt，就抛出文件找不到异常，告诉方法调用者，文件路径不对
         */
        if (!filename.equals("C:\\a.txt")){
            throw new FileNotFoundException("文件路径不是C:\\a.txt");
        }

        System.out.println("路径正确，可以进行文件读取！");
    }
}
