package JAVA接口.默认方法;

public class MyInterfaceDefaultA  implements MyInterfaceDefault{
    @Override
    public void mehtodAbs() {
        System.out.println("实现抽象方法,AAA");
    }

    @Override
    public void mehtodAbs2(){
        System.out.println("实现类A覆盖重写接口类中的默认方法");
    }
}
