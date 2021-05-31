package JAVA方法;

/*
定义一个方法：用来判断两个数字【是否】相同
 */
public class DemoMethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(20, 20));
    }

    /*
    三要素:
        1.返回值类型：boolean
        2.方法名称: isSame
        3.参数列表: int a , int b
     */
    public static boolean isSame(int a, int b){
//        boolean same;
        /*if (a == b){
            same = true;
        } else {
            same=false;
        }*/
//        same = a == b? true : false;
        //boolean same = a == b;
        return a == b;
    }
}
