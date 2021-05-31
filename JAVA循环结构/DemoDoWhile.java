package JAVA循环结构;

/*

do while 循环的标准格式：
初始化表达式
    do {
        循环体;
    } while(条件判断);
执行顺序：第一次先执行do里面的循环体，再进行判断，如果符合条件，继续执行do里面的循环体，不符合退出循环

do while 循环的扩展格式：
初始化表达式
    do {
        循环体;
        步进语句;
    } while (条件判断)
 */
public class DemoDoWhile {
    public static void main(String[] args) {
        for (int i =1; i <= 10; i++){
            System.out.println("原谅你啦！起来吧，地上够凉的" + i);
        }
        System.out.println("这是for循环");
        System.out.println("************");
        System.out.println("这是do-while循环");
        int i = 1;
        do {
            System.out.println("原谅你啦！起来吧，地上够凉的" + i);
            i++;  // 步进语句
        } while ( i <= 10);  // 条件判断
    }
}
