package JAVA线程安全.解决线程安全问题.同步方法;

import JAVA线程安全.解决线程安全问题.同步代码块.RunnableImpl;

/*
    模拟卖票
    创建三个线程，同时开启，对共享的票进行出售
 */
public class Demo01ticket {
    public static void main(String[] args) {
        // 创建Runnable类的实现类对象
        RunnableImpl impl = new RunnableImpl();

        // 创建Thread对象,构造方法中传递Runnable接口实现类的对象
        Thread th0 = new Thread(impl);
        Thread th1 = new Thread(impl);
        Thread th2 = new Thread(impl);

        // 开启多线程
        th0.start();
        th1.start();
        th2.start();
    }
}
