package JAVA可变参数;

/*
    可变参数：是JDK1.5之后出现的新特性
    使用前提：
        当方法的参数列表数据类型已经确定，但是参数的个数还不确定，就可以使用可变参数

    使用格式：定义方法时使用
        修饰符 返回值类型 方法名称(数据类型...变量名){}

    可变参数的原理：
        可变参数的底层是一个数组，根据传递参数的个数不同，会创建不同的数组，来存储这些参数
        传递的参数可以是0个（不传递），1个，2个，...多个

    可变参数的注意事项：
        1.一个方法的参数列表，只能有一个可变参数
        2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
            public static void method(String a, int b, double c, int...d){

            }

    可变参数的特殊（终极）写法
    public static void method(Object...obj){

    }

 */
public class DemoVarArgs {
    public static void main(String[] args) {
        //add();  // 没有传递参数，会创建一个长度为0的int数组 new int[0]
        int i = add(10, 20, 40);
        System.out.println(i);
    }

    /*
    定义一个方法，计算（0-n)个整数的和，数据类型已经确定为int,不确定参数的个数，使用可变参数
     */
    public static int add(int...arr){
       // System.out.println(arr); // 底层是一个数组
        // 定义一个初始化的变量，记录累加求和
        int num = 0;

        // 遍历数组，获取数组中的每一个元素
        for(int i : arr){
            // 累加求和
            num += i;
        }
        return num;
    }
}
