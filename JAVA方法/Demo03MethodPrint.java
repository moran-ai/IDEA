package JAVA方法;

/*
定义一个方法：用来打印指定次数的HelloWorld
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(5);
    }

    /*
    三要素：
    返回值类型:只是打印，没有计算，没有返回值
    方法名称: printCount
    参数列表 :要打印多少次？有参数  int
     */
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World" + (i + 1));
        }
    }
}
