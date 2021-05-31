package JAVA字符串;

/*
==是进行地址值的比较，如果需要字符串内容的比较，可以使用两个方法
public boolean equals(Object obj) 参数可以是任何对象 ;
只有参数是一个字符串并且内容相同才会返回true，否则返回fasle

注意事项：
    1.任何对象都能用Object进行接收
    2.equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样
    3.如果比较双方一个常量一个变量，推荐把常量字符串写在前面
推荐：
    "abc".equals(str)
不推荐
    str.equals("abc") 如果str为null值，程序会报空指针异常错误

public boolean equalsIgnoreCase(String str) 忽略大小写，进行内容比较
 */
public class DemoStringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // true
        System.out.println(str3.equals("Hello")); // true
        System.out.println("Hello".equals(str1)); // true
        System.out.println("=======================");
        String str5 = "abc";
        System.out.println("abc".equals(str5));  // 推荐写法
        System.out.println(str5.equals("abc")); // 不推荐写法
        System.out.println("==================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB)); // 忽略大小写
    }
}
