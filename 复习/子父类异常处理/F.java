package 复习.子父类异常处理;

public class F {
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03(){}
    public void show04(){}
}

class zi{
    // 子类重写父类方法时，父类抛出了异常，那么子类可以抛出和父类相同的异常或者父类异常的子类
    public void show01() throws NullPointerException, ClassCastException{}
    public void show02() throws ArrayIndexOutOfBoundsException{}

    // 子类重写父类方法时，如果父类没有抛出异常，那么子类也不能抛出异常
    public void show03(){}

    // 子类重写父类方法时，如果父类没有抛出异常，
    // 子类出现了异常，那么子类只能捕获处理这个异常，不能声明抛出这个异常
    public void show04(){
        try{
            throw new ClassCastException("编译期异常");
        }catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
