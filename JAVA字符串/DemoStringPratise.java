package JAVA字符串;

/*
练习：字符串按照指定的格式进行拼接
 */
public class DemoStringPratise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "world" + array[i] + "]";
            } else {
                str += "world" + array[i] + "#";
            }

        }

        return str;
    }
}
