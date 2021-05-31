package JAVA关键字static;

/*
使用static修饰成员方法，成员方法就成为了静态方法。
静态方法不属于对象，而是属于类。

如果没有static关键字，那么必须先创建对象，然后通过对象才能使用。
如果有了staitc关键，那么不需要创建对象，可以直接通过类名称来使用它。

无论是成员变量，还是成员方法，如果有static关键字，都使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法

注意：
1.静态不能直接访问非静态
原因：内存中【先】有静态内容，【后】有非静态内容
2.静态方法中不能使用this
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();  // 先创建对象
        obj.method();  // 才能使用没有static关键字的方法

        // 对于静态方法来说，可以通过对象名进行调用，也可以通过类名称直接调用
       // obj.methodStatic();  // 正确，不推荐 这种写法在编译后也会被javac翻译成“类名称.静态方法名”.
        MyClass.methodStatic();  // 正确，推荐

        // 对于本类中的静态方法，可以省略类名称
        mymethod();
    }

    public static void mymethod(){
        System.out.println("这是自己的方法！");
    }
}
