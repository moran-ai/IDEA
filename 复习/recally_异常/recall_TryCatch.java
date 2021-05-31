package 复习.recally_异常;

import java.io.IOException;

/*

TryCatch的格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        异常的处理逻辑，产生异常后，如何处理这个异常
    }
    ...
    catch(异常类名 变量名)可以有多个
 */
public class recall_TryCatch {
    public static void main(String[] args) {
        try{
            readFile("D:\\text.txt");
        }catch (IOException e){
           e.printStackTrace();
           System.out.println(e.getMessage());
        }
    }

    public static void readFile(String filename) throws IOException{
        if(!filename.equals("D:\\test.txt"));
        throw new IOException("文件路径不是D:\\test.txt");
    }

}
