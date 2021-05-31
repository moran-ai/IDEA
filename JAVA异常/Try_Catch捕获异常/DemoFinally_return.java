package JAVA异常.Try_Catch捕获异常;

/*
如果finally有return语句，永远返回finally中的结果，如何解决
不要在finally语句中写return语句
 */
public class DemoFinally_return {
    public static void main(String[] args) {
       int a =  getA();
        System.out.println(a);
    }
    // 定义一个方法，返回a的值
    public static int getA(){
        int a = 10;
        try{
            return a;
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            // 一定会执行的代码
            a = 100;
            return a;
        }
    }
}
