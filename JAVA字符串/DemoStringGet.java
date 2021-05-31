package JAVA字符串;

/*
String当中获取相关的常量方法
    1.public int length()  获取字符串当中含有的字符个数，拿到字符串长度
    2.public String concat(String str) 将当前字符串和参数字符串拼接成为返回值新的字符串
    3.public char charAt(int index) 获取指定索引位置的单个字符
    4.public int indexof(String str) 查找参数字符串在本字符串当中首次出现的索引位置，没有就返回-1
 */

/*
 字符串方法：
 1.获取字符串的长度:string.length()
 2.拼接字符串：concat(字符串变量)
 3.获取指定索引位置的字符：charAt(填入整数数字)
 4.查找字符串首次出现的索引的位置：indexof(填入字符串) 没找到返回-1
* */
public class DemoStringGet {
    public static void main(String[] args) {
        // 获取字符串的长度
        int length = "adfdffvsjiisdjfidjfidjia".length();
        System.out.println("字符串的长度是：" + length);

        // 拼接字符串 concat()方法
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);  // 输出HelloWorld
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==========");

        // 获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("在一号索引位置的字符是:" + c);
        System.out.println("==============");

        // 查找参数字符串在本来字符串中出现的第一次索引位置
        // 如果没有，返回-1
        String original = "HelloWorld";
        int llo = original.indexOf("llo");
        System.out.println("第一次索引值是：" + llo);
    }
}
