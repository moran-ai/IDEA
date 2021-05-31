package JAVA循环结构;

/*
break关键字的用法有常见的两种:
    1.可以用在switch语句当中，一旦执行，整个switch语句立刻停止
    2.还可以用在循环语句当中，一旦执行，整个循环语句立刻结束，打断循环
循环的选择建议：
    凡是次数确定的场景多用for循环，否则用while循环
 */
public class DemoBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            // 只希望输出前三个,从第四个开始就不输出
            if (i == 4){
                break;
            }
            System.out.println("Hello" + i);

        }
    }
}
