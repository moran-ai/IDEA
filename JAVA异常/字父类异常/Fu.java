package JAVA异常.字父类异常;

/*
子父类异常：
    1.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者父类异常的子类或者不抛出异常
    2.如果父类不抛出异常，子类重写父类方法时也不可以抛出异常，此时子类产生该异常，只能捕获处理，不能声明抛出
注意：
    父类异常是什么样，子类异常也就是什么样
 */

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03(){}
    public void show04(){}
}

// 子类
class Zi{
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException,ClassCastException{}
    // 子类重写父类方法时,抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException{}
    // 子类重写父类方法时,不抛出异常
    public void show03(){}

    /*
    父类不抛出异常，子类重写父类方法时也不可以抛出异常，
    此时子类产生该异常，只能捕获处理(使用try-catch)，不能声明抛出
     */
    public void show04(){
        try{
            throw new ClassCastException("编译期异常");
        }catch (ClassCastException e){
            System.out.println(e.toString());
        }
    }
}
