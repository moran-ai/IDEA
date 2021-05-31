package 复习.可变参数;

/*
可变参数：
    是java1.5以后出现的新特性
    使用前提：当方法的参数列表的数据类型已经确定，但是参数的个数还没有确定，可以使用可变参数

使用格式：定义方法时使用
    格式：
        修饰符 返回值类型  方法名称(数据类型...变量名){
            方法体;
        }

原理：
    1.可变参数的底层是一个数组，根据传递参数的个数的不同，会创建不同的数组

注意事项：
    1.一个方法的参数列表中，只有有一个可变参数
    2.如果的方法的参数有多个，那么可变参数必须写在的参数列表的最后
     public static void method(String a, int b, double,int ...d){
        方法体;
     }

 可变参数的特殊写法：
    public  static void method(Object ...obj){
        方法体;
    }
 */
public class recall_VarArgs {
    public static void main(String[] args) {
        int sum = add(1,2,3,4,5);
        System.out.println(sum);
    }

    // 可变参数
    public static int add(int...arr){
        int num = 0;

        // 求和
        for(int i : arr){
            num += i;
        }
        return num;
    }
}
