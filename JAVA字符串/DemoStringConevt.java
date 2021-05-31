package JAVA字符串;

/*
String当中与转换相关的常用方法
    1.public char[] toCharArray() 将当前字符串拆分为字符数组作为返回值
    2.public byte[] getBytes() 获得当前字符串底层的字节数组
    3.public String replace(CharSequence oldString, CharSequnce newString)
    将所有出现的老字符串替换为新的字符串，返回替换之后的结果新字符串
CharSequnce可以接收字符串类型
 */
public class DemoStringConevt {
    public static void main(String[] args) {
        // 转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars.length);
        System.out.println("=============");

        // 转换为字节数组
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("===============");

        // 字符串替换
        String str = "How do you do?";
        String o = str.replace("o", "*");
        System.out.println(o);

    }
}
