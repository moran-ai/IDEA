package JAVA字符串;

/*
练习：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串。格式如下：[world1#world2#world3]

分析：
1.准备一个int[]数组，数组元素是{1,2,3}
2.将数组转为字符串
三要素：
    返回值类型：String
    方法名称：fromArrayToString
    参数列表：int[]
用到：for循环、字符串拼接、每个数组元素前有一个word字段、分隔使用#、区分是不是最后一个
 */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int array [] = {1, 2, 3};
        String result = fromArrayToString(array);
        System.out.println(result);
    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++){
            if (array[i] == array.length){
;                str += "world" + array[i] + "]";
            }else{
                str += "world" + array[i] + "#";
            }

        }
        return str;
    }

}
