package JAVASCII编码表;

/*
数字和字符的对照关系表(编码表):
ASCII码表：American Standard Code Information Interchange 美国信息交换标准码
Unicode码表: 万国码，也是数字和符号的对照关系，开头0-127部分和ASCII完全一样，但是从128开始包含更多字符
*/

public class Demo03DataTypeChar{
    public static void main(String[] args){
        char zifu1 = '1';
        System.out.println(zifu1+0); // 49
        System.out.println("============================");
        char zifu3 = 'c';
        // char -- > iint ,从小到大
        // 自动类型转换
        int num = zifu3;
        System.out.println(num); // 输出99
        System.out.println("============================");
        char zifu4 = '中'; // 正确写法
        System.out.println(zifu4+0); // 20013
    }
}
