package JAVAFile类;

import java.io.File;

/*
    路径：
        绝对路径和相对路径
     绝对路径：是一个完整的路径 以盘符开始的路径
     相对路径：是一个简化的路径 相对指的是当前项目的根目录

   注意:
        1.路劲不区分大小写
        2.路径中的文件分割符windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
 */
public class Demo02File {
    public static void main(String[] args) {
        /*
            File类的构造方法

         */
//        show1("D:\\", "a.txt");  // D:\a.txt
        show02();
    }

    private static void show02() {
        /*
            File(File parent, String child) 根据parent抽象路径和child字符串创建一个新的File实例
            参数：路径分为两个部分
            File parent:父路径
            String child:子路径

            好处：
                1.父路径和子路径可以单独书写，使用非常灵活，父路径和子路径可以变化
                2.父路径是File类型，可以使用File类的方法对路径进行一些操作，再使用路径创建对象
         */
            File parent = new File("D:\\");
            File f = new File(parent, "hello.txt");
            System.out.println(f);
    }

    private static void show1(String parent, String child) {
        /*
            File(String parent, String child):根据parent路径名称和child路径名称创建新的File类对象
            参数：路径分为了两个部分
                1.String parent: 父路径
                2.String child: 子路径
            好处：父路径和子路径可以单独书写，使用非常灵活，父路径和子路径可以变化

         */
        File f = new File(parent, child);
        System.out.println(f);
    }

    private static void show() {
        /*
        File (String pathname) 通过将给定路径的名字字符串转化为抽象路径名来创建一个新的File实例
        参数：
            String pathname:字符串的路径名称
            路径可以是以文件结尾，也可以是文件夹结尾
            路径可以是绝对路径，也可以是相对路径
            路径可以是存在，也可以是不存在
            创建File对象，只是把字符串封装为File对象，不考虑路径的真实情况
         */

        File f1 = new File("D:\\wenjian\\a.txt");  // 以文件结尾
        System.out.println(f1); // 重写了Object类中的toString()方法
        System.out.println("================================");

        File f2 = new File("D:\\wenjian");  // 以文件夹结尾
        System.out.println(f2);
        System.out.println("=======================");
        File f3 = new File("a.txt");
        System.out.println(f3);
        System.out.println("=======================");
    }
}
