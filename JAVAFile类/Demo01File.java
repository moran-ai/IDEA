package JAVAFile类;

import java.io.File;

/*
java.io.File类：文件和目录路径名的抽象表示方式
    java把电脑中的文件和文件夹（目录）封装为一个File类，可以使用File类对文件和文件夹进行操作
    File类中的方法：
        1.创建文件/文件夹
        2.删除文件/文件夹
        3.获取文件/文件夹
        4.判断文件/文件夹是否存在
        5.对文件/文件夹进行遍历
        6.获取文件的大小
    File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法

    三个单词 ：
        1.file:文件
        2.directory:目录/文件夹
        3.path:路径
 */
public class Demo01File {
    public static void main(String[] args) {
        /*
        静态方法
            public static String pathSeparator 与系统有关的路径分割符，它表示为一个字符串
            public static char pathSeparatorChar 与系统有关的路径分割符
            public static String separator 与系统有关的默认名称分割符，表示为一个字符串
            public static char separatorChar 与系统有关的默认名称分割符

          操作系统中的文件名分割符不能写死
                 "c:" + File.separator + "develop" + File.separator + "a.txt"
         */
        String pathseparator = File.pathSeparator;
        System.out.println(pathseparator); // 路径分割符 windows:分号  linux:冒号
        System.out.println("=======================");
        String separator = File.separator;
        System.out.println(separator);  // 文件名称分割符 windows:\    linux:/
        System.out.println("=======================");
    }
}
