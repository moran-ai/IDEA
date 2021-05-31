package JAVAfinal关键字.修饰类;

/*
final关键字用来修饰类时，格式：
public final class 类名称{

}
含义：当前这个类不能有任何的子类。（太监类）
注意：如果一个类被final关键字修饰，那么这个类中的所有成员方法都不能被覆盖重写（没有子类）
 */
public final class MyClass {
    public void method(){
        System.out.println("方法执行");
    }
}
