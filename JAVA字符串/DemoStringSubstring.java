package JAVA字符串;

/*
字符串的截取：
    1.public String substring(int index) 截取从参数位置一直到字符串末尾，返回新字符串
    2.public String substring(int begin, int end)
    截取从begin开始，一直到end结束,中间的字符串[begin, end) 包含左边，不包含右边
 */

public class DemoStringSubstring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str2);
        System.out.println("============");

        String str3 = str1.substring(4, 7);
        System.out.println(str3);
        System.out.println("==============");

        /*
        下面有两个字符串："Hello","JAVA"
        strA当中保存的是地址值，本来的地址值是Hello的ox666
        现在的地址值变成了JAVA的0x9999
         */
        String strA = "Hello";
        System.out.println(strA);
        strA = "JAVA";
        System.out.println(strA);
    }
}
