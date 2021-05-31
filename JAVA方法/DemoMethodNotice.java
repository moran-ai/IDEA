package JAVA方法;

/*
使用的方法的注意事项：
    1.方法应该定义在类中，但不能在方法中再定义方法，不能嵌套
    2.方法定义的前后顺序无所谓
    3.方法定义之后不会执行，如果要执行，一定要调用：调单独调用、打印调用、赋值调用
    4.如果方法有返回值，那么必须写上return
    5.return 后面的返回值数据，必须和方法的返回值类型，对应起来
    6.对于一个void没有返回值的方法，不能写return后面的返回值，只能写return自己
    7.对于方法当中的最后一行的return可以省略不写
    8.一个方法中可以有多个return语句，但是必须保证同时只有一个会被执行到
 */
public class DemoMethodNotice {
    public static void main(String[] args) {

    }
    public static int method1(){
        return 10;
    }

    public static void method2(){
        return; // 没有返回值，只是结束方法
    }

    public static void method3(){
        System.out.println("AAAA");
        System.out.println("BBBB");
       // return;  // 最后一行的return可以不写,在没有返回值的情况下
    }

    public static int getMAx(int a , int b){
//        int max;
//        if (a >b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        return max;
        if (a > b) {
            return a;
        } else {
            return b;
        }
        }
}
