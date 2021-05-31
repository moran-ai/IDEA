package JAVA异常.异常的处理;

/*
  throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式:
        throw new xxxException("异常产生的原因");
    注意事项：
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类
        3.throw关键字抛出指定的异常对象，就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是RuntimeException的子类，可以不处理，默认交给
            JVM处理（打印异常对象，中断程序）
            throw关键字后边创建的编译对象（写代码报错），就必须处理，要么throws,要么try...catch
 */
public class Demo01Throw {
    public static void main(String[] args) {
        int [] array =  null;
        int e = getElement(array, 3);
//        System.out.println(e);
    }

    /*
    定义一个方法，获取数组指定索引的元素
    参数：
        int [] arr, int index
     首先对方法传递过来的参数，进行合法性的校验，
     如果参数不合法，就使用抛出异常的方式，告诉方法调用者，传递的参数有问题
     */
    public static int getElement(int [] arr, int index){
        /*
        对传递过来的参数数组，进行合法性校验
        如果数组arr的值是null,
        抛出空指针异常，告诉方法调用者“传递的参数数组值为null”
        注意：
            NullPointerException是运行期异常，不用处理，默认交给JVM处理
         */
        // 方法一：使用throw关键进行空指针异常处理
        if (arr == null){
            throw new NullPointerException("传递的数组值为null");
        }

        // 方法二：使用Objects进行空指针异常处理
        //Objects.requireNonNull(arr, "传递的数组值为null");

        /*
        对传递的参数index进行校验，
        如果参数index不在数组的索引范围内，
        抛出数组越界异常，告知方法调用者“传递的索引超出数组的使用范围”
        IndexOutOfBoundsException是运行期异常，不用处理，默认交给JVM处理
         */
        if (index < 0 || index > arr.length-1){
            throw new IndexOutOfBoundsException("数组索引越界");
        }
        int ele = arr[index];
        return ele;
    }
}
