package 复习;

public class recall_string {
    public static void main(String[] args) {
//    stringconcat();
//        stringcharAt();
//        stringindexof();
//        stringtocharray();
//        stringgetBytes();
//        stringreplace();
//        stringsubstring();
        stringequals();
    }

    // 定义一个方法实现字符串的分割  分割方法:String.spilt("分割方式")
    public static void stringspilt() {
        String str = "aaa,bbb,ccc";
        String[] array = str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // 定义一个方法，实现字符串的拼接 拼接方法：字符串1.concat(字符串2)
    public static void stringconcat(){
        String str = "a";
        String str1 = "b";
        String str2 = str.concat(str1);
        System.out.println(str2);
    }

    // 定义一个方法，获取指定索引位置的字符  方法：charAt 类型是char类型
    public static void stringcharAt(){
        String str = "abc";
        char str1 = str.charAt(1);
        System.out.println("在第一个索引位置的字符是：" + str1);
    }

    // 定义一个方法，查找单个字符串首次出现的索引位置 ，如果没有，返回-1 方法：indexOf() 类型是int
    public static void stringindexof(){
        String str = "abc";
        int str2 = str.indexOf("c");
        System.out.println("字母c第一次出现的位置是：" + str2);
    }

    // 定义一个方法，将字符串转为字符数组  方法：String.toCharArray() 类型为char
    public static void stringtocharray(){
        char [] chars = "abc".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars.length);  // 打印数组长度
    }

    // 定义一个方法，将字符串转为字节数组 方法：string.getBytes() 类型为byte
    public static void stringgetBytes(){
        byte[] bytes = "abc".getBytes();
        System.out.println(bytes[0]);  // 结果为97
        System.out.println(bytes[1]);  // 结果为98
        System.out.println(bytes[2]);  // 结果为99
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
    }

    // 定义一个方法，实现字符串的替换  方法：string.replcae("原始字符串","替换后的字符串")
    public static void stringreplace(){
        String str = "abc";
        String str1 = str.replace("a", "1");
        System.out.println(str1);
    }

    // 定义一个方法，实现字符串的截取  方法：substring(索引位置1, 索引位置2) 包括左边，不包括右边
    public static void stringsubstring(){
        String str = "aaacccvvv";
        String str1 = str.substring(5);
        System.out.println("截取前四个的结果是：" + str1);
    }

    // 定义一个方法，实现字符串的比较 方法：字符串1.equals(字符串2)
    public static void stringequals(){
        String str = "aaabbbcc";
        String str1 = "addfdad";
        System.out.println(str.equals(str1));  // 返回值的结果是布尔值,长度相等为true,否则为false
    }
}
