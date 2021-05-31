package 复习;

public class recall_dowhile {
    public static void main(String[] args){
       // W();
        //even();
       // h();
        //three();
        a();
    }
    // do-while循环
    public static void w(){
        int i = 0;
        do{
            System.out.println("哈哈会");
            i++;
        } while (i < 2);
    }

    // 定义一个方法，实现do-while循环计算1-100之间所有偶数的和
    public static void  W(){
        int nums = 0;
        int num = 0;
        int i = 1;
        do{
            if (i % 2 ==0){
               num+=i;
            } else {
                if (i % 2 != 0){
                    nums+=i;
                }
            }
            i++;
        } while (i <= 100);
        System.out.println("1-100之间所有偶数的和是：" + num); // 2550
        System.out.println("1-100之间所有奇数的和是：" + nums); // 2500
    }

    // 定义一个方法，实现while循环计算1-100之间的偶数和和奇数和
    public static void even(){
        int nums = 0;
        int num = 0;
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0){
                num+=i;
            } else {
                if (i % 2 != 0){
                    nums+=i;
                }
            }
            i++;
        }
        System.out.println("================");
        System.out.println("1-100之间的偶数和是：" + num);  // 2550
        System.out.println("1-100之间的奇数和是：" + nums); // 2500
    }

    // 定义一个方法，实现for循环计算1-100之间所有奇数和偶数的和
    public static void h(){
        int nums = 0;
        int num = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                num+=i;
            } else {
                if (i % 2 !=0){
                    nums +=i;
                }
            }
        }
        System.out.println("偶数和是：" + num);
        System.out.println("奇数和是：" + nums);
    }

    // 定义一个方法，实现三元运算符
    public static void three(){
        /*
        三元运算符格式;
            数据类型 变量名称 = 条件判断? 表达式a:表达式b;
            表达式a和表达式b的数据类型必须和前面的变量名称数据类型一致
         */
        int a = 10;
        int b = 20;
        int max = a > b ? a:b;
        System.out.println("最大值是：" + max);
    }

    // 定义一个方法，实现自增和自减运算
    public static void a(){
        int a = 5;
        int b = 6;
        int c = a++ + --b;
        System.out.println("============");
        System.out.println(c); // 10
        System.out.println("============");
        System.out.println(a); // 6
        System.out.println("=============");
        System.out.println(b); // 5
    }
}
