package 复习.recally_异常;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
throws关键字的格式：
    修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException{
        throw AAAException(产生错误的原因);
        throw BBBException(产生错误的原因);
    };

注意：
    1.方法内部如果抛出了多个异常，那么throws后面也必须抛出多个异常
        如果声明的异常有父子类关系，那么直接声明父类即可
    2.throws关键字后面声明的必须是Exception或者Exception的子类
    3.throws关键字必须写在方法声明处
 */
public class recall_Throws {
    // 调用了一个抛出异常的方法readFile，必须处理这个异常
    public static void main(String[] args) throws Exception{
        readFile("D:\\test.txt");
    }

    // IOException,FileNotFoundException extends Exception,所以直接声明Exception即可
    public static void readFile(String filename) throws Exception{
        if (!filename.endsWith(".txt")){
            throw new IOException("文件后缀名错误");
        }

        if (!filename.equals("D:\\test.txt")){
            throw new FileNotFoundException("文件的路径不是D:\\test.txt");
        }

        System.out.println("路径正确，可以进行文件读取");
    }
}
