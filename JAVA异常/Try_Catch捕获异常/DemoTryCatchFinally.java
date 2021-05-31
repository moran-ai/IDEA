package JAVA异常.Try_Catch捕获异常;

import java.io.IOException;

/*
finally代码块
格式：
    try{
        可能产生异常的代码
    }catch(定义一个异常的变量，用来接收try中抛出的异常对象){
        异常的处理逻辑，产生异常对象后，如何处理异常对象
        在工作中，会把异常信息记录到日志中
    }
    ...
    catch(异常类名 变量名){

    } finally{
        无论是否出现异常都会执行
    }
注意事项：
    1.finally不能单独使用，必须和try一起使用
    2.finally用于资源释放（资源回收），无论程序是否出现异常，都会释放资源

 */
public class DemoTryCatchFinally {
    public static void main(String[] args) {
        try{
            // 可能会出现异常的代码
            readFiel("C:\\a.txt");
        } catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            // 无论是否出现异常都会执行
            System.out.println("资源释放");
        }
    }

    /*
      如果传递的路径不是C:\\a.txt，就抛出文件找不到异常，告诉方法调用者，文件路径不对
       */
    public static void readFiel(String filename) throws IOException {
        if (!filename.equals("C:\\a.txt")){
            throw new IOException("文件路径不是C:\\a.txt");
        }
        System.out.println("路径正确");
    }
}
