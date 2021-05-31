package 复习.StringBuilder类;

/*
java.lang.StringBuilder：字符串缓冲区，可以提高效率
构造方法
    1.StringBuilder()构造一个不带任何的字符的字符串生成器，初始容量为16个字符
    2.StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容

成员方法：
    1.public StringBuilder append(...) 添加任意类型的字符串，并返回对象本身
    2.StringBuilder --> String 的方法 toString()
 */
public class recall_StringBuilder {
    public static void main(String[] args) {
        // 构造一个无参数的StringBuilde
        StringBuilder string = new StringBuilder();
        System.out.println(string);
        System.out.println("==================================");

        // 构造一个有参数的StringBuildr
        StringBuilder stringBuilder = new StringBuilder("abc");
        System.out.println(stringBuilder);
        System.out.println("==================================");
        method(string);
        System.out.println("==================================");

        StringBuilder str = new StringBuilder();
        method1(str);
    }

    // 定义一个方法,字符串中添加数据 使用append方法无需接收返回值
    public static void method(StringBuilder stringBuilder){
        stringBuilder.append(2);
        stringBuilder.append("a");
        stringBuilder.append(1.2);
        stringBuilder.append(true);
        System.out.println(stringBuilder);
    }

    // 定义一个方法，StringBuilder转为String  toString方法
    public static void method1(StringBuilder str){
        str.append(345);

        // StringBuilde转为字符串
        String s = str.toString();
        System.out.println(s);
    }
}
