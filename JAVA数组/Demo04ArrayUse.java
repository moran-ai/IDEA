package JAVA数组;

/*
直接打印数组名称，得到的是数组对应的-内存地址哈希值
二进制:01
十进制:0123456789
十六进制:0123456789abcdef

访问数组元素的格式：
    数组名称[索引值];
索引值：就是一个int数字，代表数组当中元素的编号
【注意】：索引值从0开始，一直到数组长度-1为止
 */
public class Demo04ArrayUse {
    public static void main(String[] args) {
        // 静态初始化的省略格式
        int[] array = {10, 20, 30};
       // System.out.println(array);  // 输出 [I@10f87f48，代表数组的内存地址名称
        System.out.println(array[0]);  // 输出 10
        System.out.println(array[1]);  // 输出 20
        System.out.println(array[2]);  // 输出 30
        System.out.println("========");
        int num = array[1];  // 赋值交给变量
        System.out.println(num);  // 输出20
    }

}
