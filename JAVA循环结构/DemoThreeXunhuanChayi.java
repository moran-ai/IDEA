package JAVA循环结构;

/*
三种循环的区别:
    1.如果条件判断从来没有满足过，那么for循环和while循环将会执行0次，但是do-while循环会至少执行一次
    2.for循环的【变量】在小括号中定义，只有【循环内部】可以使用;
    while循环和do-while循环【初始化语句】在外面，【出了循环】后【初始化语句】还可以使用
 */
public class DemoThreeXunhuanChayi {
    public static void main(String[] args){
        for (int i = 1; i < 0; i++){
            System.out.println("Hello");
        }
        System.out.println("=========");

        int a = 1;
        do {
            System.out.println("Hi");
            a++;
            } while ( a < 0);
        System.out.println(a);  // 输出2
        }
    }