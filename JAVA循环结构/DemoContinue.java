package JAVA循环结构;

/*
continue关键字：
    一旦执行，立刻跳过当前循环内容，马上开始下一次循环
 */
public class DemoContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            if (i==4){  // 跳过4
                continue;
            }
            System.out.println(i + "几层到了！");
        }
    }
}
