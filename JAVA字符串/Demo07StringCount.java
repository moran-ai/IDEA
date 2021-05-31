package JAVA字符串;

import java.util.Scanner;

/*
题目：
键盘输入一个字符串，并且统计出各种字符串出现的次数
种类有：大写字母、小写字母、数字、其他

分析：
1.Scanner
2.String sc = sc.next()
3.定义四个变量，分别代表四种字符出现的次数
4.需要对字符串一个字的检查，String-->char[] toCharArray()
5.遍历数组，进行判断，并且用四个变量进行++操作
6.打印
 */
public class Demo07StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input = sc.nextLine();  // nextLine()可以检测到空格

        int countUper = 0;  // 大写字母
        int countlower = 0; // 小写字母
        int countnumber = 0; // 数字
        int countOther = 0; // 其他字符

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            char ch = charArray[i];
            if ('A' <= ch && ch <='Z'){
                countUper++;
            }else if('a' <= ch && ch <= 'z'){
                countlower++;
            }else if ('0' <= ch && ch <='9'){
                countnumber++;
            }else {
                countOther++;
            }
        }
        System.out.println("大写字母有：" + countUper + "个！");
        System.out.println("小写字母有：" + countlower + "个！");
        System.out.println("数字有：" + countnumber + "个！");
        System.out.println("其他字符有：" + countOther + "个！");
    }
}
