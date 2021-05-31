package JAVA字符串;

/*
分割字符串的方法
public String[] split(String regex) 按照参数的规则，将字符串切分为若干部分

注意事项：
    spilt方法的参数其实是正则表达式
    如果按照英文句点‘.’进行切分，必须写"\\."(两个反斜杠)
 */
public class DemoStringSplit {
    public static void main(String[] args) {
        String str = "aaa,bbb,ccc";
        String[] array1 = str.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("以逗号分割！");
        System.out.println("===========");

        String str1 = "aaa bbb ccc";
        String[] s = str1.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        System.out.println("以空格分割！");
        System.out.println("==============");
        String str2 = "aaa.bbb.ccc.";
        String[] split = str2.split("\\.");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        System.out.println("以'\\.'分割！");  // "\\.表示以英文句点进行分割"
    }
}
