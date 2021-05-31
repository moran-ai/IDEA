package JAVA线程池;

/*
重写run()方法,设置线程任务
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        // 获取线程名称
        System.out.println(Thread.currentThread().getName() + "执行");
    }
}
