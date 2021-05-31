package JAVA内部类.概念与分类.局部内部类.final问题;

/*
局部内部类访问所在方法的局部变量，这个局部变量必须是有效final的,即局部变量不可变

备注：从Java8+开始，只要局部变量不变，final关键字可以省略

原因:
1.new出来的对象在堆内存中
2.局部变量跟着方法走，在栈内存当中
3.方法运行结束后，局部变量会立刻消失
4.new出来的对象会持续存在于堆内存当中，直到垃圾回收为止
 */
public class MyOuter {
    public void methodOuter(){
        int num = 10;

        // 局部内部类
        class MyInner{
            public void Inner(){
                System.out.println(num);
            }
        }
    }
}
