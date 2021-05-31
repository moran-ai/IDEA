package JAVAStringBuilder类;

/*
    java.lang.StringBuilder类：字符串缓冲区，可以提高效率
    构造方法：
        StringBuilder()构造一个不带任何字符的字符串生成器，其初始容量为16个字符
        StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
 */
public class Demo01StringBuiler {
    public static void main(String[] args) {
        // 空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:" + bu1);  // bu1:""
        System.out.println("=========================");
        // 有参数的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:" + bu2);  // abc
    }
}
