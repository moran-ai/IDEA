package JAVAStringBuilder类;

/*
    StringBuilder和String可以相互转换
        String -> StringBuilder 可以使用StringBuilder的构造方法
            StringBuilder(String str) 构造一个字符串生成器，并初始化为指定的字符串内容
        StringBuilder->String 使用StringBuilder中的toString方法
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        // String -> StringBuilder
        String str = "Hello";
        System.out.println("str:" + str);

        StringBuilder bu = new StringBuilder(str);

        // 添加数据
        bu.append("world");
        System.out.println("bu:" + bu);

        // StringBuilder->String
        String s = bu.toString();
        System.out.println("s：" + s);
    }
}