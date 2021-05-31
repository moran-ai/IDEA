package JAVALambda表达式;

/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class Demo01Runnable {
    public static void main(String[] args) {
         // 创建实现类对象
        RunnableImpl impl = new RunnableImpl();

        // 创建Thread对象,构造方法中传递Runnable接口的实现类对象
        Thread t = new Thread(impl);

        // 调用start()开启线程，执行线程
        t.start();
        System.out.println("===========================================");

        // 简化代码，使用匿名内部类，实现多线程程序
        Runnable r = new Runnable(){
            // 重写run()方法，设置线程任务
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        };
        new Thread(r).start();

        // 继续简化代码
        new Thread(new Runnable(){
            // 重写run()方法，设置线程任务
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
            }
        }).start();

        }
}
