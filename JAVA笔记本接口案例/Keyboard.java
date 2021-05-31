package JAVA笔记本接口案例;

public class Keyboard implements USB {
    @Override
    public void open(){
        System.out.println("打开键盘");
    }

    @Override
    public void close(){
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }


}
