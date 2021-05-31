package JAVALambda表达式;

/*
    创建Runnable接口的实现类，重写run()方法，设置线程任务
 */
public class RunnableImpl implements Runnable{
    // 重写run()方法

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "新线程创建");
    }
}
