package JAVA继承.重写;

public class NewPhone extends Phone{
    @Override
    public void show(){
        super.show(); // 使用父类中的方法show()

        // 子类方法show()重新添加新的内容
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
