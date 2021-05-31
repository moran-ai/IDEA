package JAVA方法.重载;

/*
对于功能类似的方法来说，因为参数列表不同，却需要记住很多方法名称，太麻烦

方法的重载(Overload)；
    多个方法的名称一样，但是参数不同
好处：只需要记住一个方法名，就可以实现类似的多个功能

 【方法重载与下列因素有关】：
    1.参数的个数不同
    2.参数的类型不同
    3.参数的多类型顺序不同

   【方法的重载与下列因素无关】
        1.与参数名称无关
        2.与方法的返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        // 方法的重载，在所定义的方法中进行选择,那个方法的参数对应的上就用那个方法
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
    }

    public static int sum(int a, int b){
        System.out.println("有2个参数的方法执行！");
        return a + b;
    }

    public static int sum(int a, int b, int c){
        System.out.println("有3个参数的执行！");
        return a + b + c;
    }

    public static int sum(int a , int b, int c, int d){
        System.out.println("有4个参数的执行！");
        return a + b + c + d;
    }

    // 参数的类型
    public static int sum(double a , double b){
        return (int) (a+b);
    }

    // 参数的多类型顺序不同
    public static int sum(int a , double b){
        return (int) (a + b);
    }

    public static int sum(double a , int b){
        return (int) (a + b);
    }
}
