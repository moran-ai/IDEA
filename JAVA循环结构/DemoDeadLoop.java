package JAVA循环结构;

/*
死循环:
    永远停不下来
死循环的标准格式:
    while (true){
        循环体;
    }
 */
public class DemoDeadLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){ // 去掉i++就变成了死循环
            System.out.println("Hello" + i);
        }
    }
}
