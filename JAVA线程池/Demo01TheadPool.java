package JAVA线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
线程池：jdk1.5之后提供内置
java.util.Concurrent.Executors:线程池的工厂类，用来生成线程池
Executors中的静态方法：
    static ExecutorService newFixedThreadPool(int nThreads)：创建一个可重用固定线程的线程池
    参数：
        int nThreads:创建线程池中包含的线程数量
    返回值：
   ExecutorService:接口，返回的是ExecutorService接口的实现类对象，使用ExecutorService接口接收（面向接口)

   java.util.Concurrent.ExecutorService:线程池接口
    用来从线程池中获取线程，调用start()方法,执行线程任务
        submit(Runnable task)方法,提交一个Runnable任务用于执行
    关闭/销毁线程池方法：
        void shutdown()

    线程池的使用：
        1.使用线程池的工厂类：Executors里面提供的静态方法newFixedThreadPool()生产指定数量的线程池
        2.创建一个类，实现Runnabler接口，重写run()方法,设置线程任务
        3.调用ExecutorService中的方法submit()，传递线程任务,开启线程,执行run()方法
        4.调用ExecutorService中的方法shutdown()，销毁线程池（不建议执行）
 */
public class Demo01TheadPool {
    public static void main(String[] args) {
        // 1.获取线程池
        ExecutorService e = Executors.newFixedThreadPool(2);

        // 3.调用ExecutorService中的方法submit()，传递线程任务,开启线程,执行run()方法
        // 线程会一直开启，使用完后，会自动归还给线程池
        e.submit(new RunnableImpl());

    }
}
