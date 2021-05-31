package JAVALambda表达式;

/*
lambda表达式的标准格式：
    由三部分组成：
        1.一些参数
        2.一个箭头
        3.一段代码

    格式：
        (参数列表) -> {一些重写方法的代码};

    解析格式：
        1.():接口中抽象方法的参数列表,没有参数就空着，有参数就写参数，多个参数使用逗号隔开
        2.->：传递，把参数传递给方法体{}
        3.{}:重写接口的方法体
 */
public class DemoLambda {
    public static void main(String[] args) {
        // 使用匿名内部类的方式实现多线程
        new Thread(new Runnable(){
            // 重写run()方法，设置线程任务
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        }).start();

        // 使用Lambada，实现多线程
        // 如果{}中的代码只有一行。无论是否有返回值，都可以省略({},return,分号)
        // {},return,分号必须一起省略
//        new Thread(() ->{
//                System.out.println("匿名内部类创建线程");
//            }
//        ).start();

        new Thread(() -> System.out.println("匿名内部类创建线程")).start();
    }
}
