package JAVA接口;

/*
接口的实现类
 */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    // 覆盖重写接口里的所有抽象方法
    @Override
    public void methodAbs(){
        System.out.println("方法一");
    }

    @Override
    public void methodAbs1() {
        System.out.println("方法二");
    }

    @Override
    public void methodAbs2() {
        System.out.println("方法三");
    }
}
