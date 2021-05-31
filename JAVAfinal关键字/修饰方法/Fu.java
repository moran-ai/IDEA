package JAVAfinal关键字.修饰方法;

/*
final关键字修饰成员方法时，就是最终方法，不能被重写
格式：
修饰符 final 返回值类型 方法名称(参数列表){
    方法体;
}

注意：对于类和方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 */
public class Fu {
    public final void method(){
        System.out.println("父类方法");
    }
}
