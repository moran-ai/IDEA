package JAVA笔记本接口案例;

public class Mouse implements USB {
    @Override
    public void open(){
        System.out.println("打开鼠标");
    }

    @Override
    public void close(){
        System.out.println("关闭鼠标");
    }

    public void clik(){
        System.out.println("鼠标点击");
    }
}
