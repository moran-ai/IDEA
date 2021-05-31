package JAVAFile类.判断功能;

import java.io.File;

/*
File判断功能的方法：
    1.public boolean exists():判断此File表示的文件或目录是否实际存在
    2.public boolean isDirectory():判断此File是否是目录
    3.public boolean isFile():判断此File是否是文件
 */

public class DemoFile {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        /*
        2.public boolean isDirectory():判断此File是否是目录
            用于判断构造方法中的路径是否以文件夹结尾
                是:返回true
                否：返回false
        3.public boolean isFile():判断此File是否是文件
            用于判断构造方法中的路径是否以文件结尾
                是：true
                否：false

         注意：
            电脑的硬盘中只有文件和文件夹，这两个方法是互斥的
            这两个方法的使用前提，路径必须是存在，否则返回false
         */
        File f1 = new File("D:\\a.txt");
        File f2 = new File("a.txt");
        boolean b1 = f1.isDirectory();
        boolean b2 = f2.isFile();
        System.out.println(b1); // 返回false
        System.out.println(b2); // 返回ture

    }

    private static void show01(){
        /*
        1.public boolean exists():判断此File表示的文件或目录是否实际存在
        判断构造方法中的路径是否存在
        存在，返回ture,
        不存在：返回false
         */
        // 创建File对象
        File f = new File("D:\\a.txt");
        boolean b = f.exists();
        System.out.println(b); // 返回false
    }
}
