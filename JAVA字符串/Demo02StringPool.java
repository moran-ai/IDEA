package JAVA字符串;

/*
字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中

对于基本类型来说，==是进行【数值】的比较.
对于引用类型来说，==是进行【地址值】的比较.

双引号直接写的字符串在字符串常量池中，new的不在字符串常量池中
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        char [] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);

        System.out.println(str == str1); // true
        System.out.println(str1 == str2); // false
        System.out.println(str == str2); // false
    }
}
