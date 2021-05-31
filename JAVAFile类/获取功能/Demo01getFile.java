package JAVAFile类.获取功能;

import java.io.File;

/*
获取功能的方法：
    1.public String getAbsolutePath():返回此File的绝对路径的字符串
    2.public String getPath():将此File转换为路径字符串
    3.public String getName():返回此File表示的文件或者目录的名称
    4.public Long length() :返回此File表示的文件的长度
 */
public class Demo01getFile {
    public static void main(String[] args) {
        show4();
    }

    private static void show4() {
        /*
        4.public Long length() :返回此File表示的文件的长度
        返回构造方法指定的文件大小，单位是字节
        注意：
            1.文件夹没有大小，不能获取文件夹大小
            2.如果构造方法中给出的路径不存在，length返回0
         */
        File f1 = new File("D:\\a.txt");
        File f2 = new File("a.txt");
        long l1 = f1.length();
        long l2 = f2.length();
        System.out.println(l1); // 给出的路径不存在，返回0
        System.out.println("==============");
        System.out.println(l2); // 给出的路径不存在，返回0
    }

    private static void show3() {
        /*
        3.public String getName():返回此File表示的文件或者目录的名称
        获取的就是构造方法传递路径的结尾部分(文件/文件夹)
         */
        File f1 = new File("D:\\a.txt");
        File f2 = new File("a.txt");
        String n = f1.getName(); // 文件/文件夹结尾部分
        String n1 = f2.getName(); // 文件/文件夹结尾部分
        System.out.println(n);
        System.out.println(n1);
    }

    private static void show2() {
        /*
        2.public String getPath():将此File转换为路径字符串
        toString()方法调用的就是getPath()方法
         */
        File f1 = new File("D:\\a.txt");
        File f2 = new File("a.txt");
        String a = f1.getPath(); // 路径是绝对就返回绝对
        String b = f2.getPath(); // 路径是相对就返回相对
        System.out.println(a);
        System.out.println("===============");
        System.out.println(b);
    }

    private static void show1() {
        /*
         1.public String getAbsolutePath():返回此File绝对路径的字符串
         获取构造方法中传递的路径
         无论传递是绝对路径还是相对路径getAbsolutePath()返回的都是绝对路径
         */
        File f1= new File("D:\\a.txt");
        String absolutepath = f1.getAbsolutePath();
        System.out.println(absolutepath);

        File f2 = new File("a.txt");
        String ab = f2.getAbsolutePath();  // 返回绝对路径
        System.out.println(ab);
    }
}
