package JAVA多线程.创建多线程的第一种方式Thread;

/*
    创建多线程的第一种方式：创建Thread类的子类
    java.Lang.Thread类：是描述线程的类，要实现多线程，就必须继承Thread类

    实现步骤：
        1.创建一个Thread类的子类
        2.在Thread类的子类中重写Thread类的run()方法，设置线程任务（开启线程要做什么)
        3.创建Thread类的子类对象
        4.调用Thread类中的start()方法，开启新的线程，执行run()方法
            void start() 使该线程开始执行，java虚拟机调用该线程的run()方法，
            结果是两个线程并发的执行；当前线程（main线程）和另一个线程（创建新的线程，执行其run()方法）
            多次启动一个线程是一个非法的，特别是当线程已经结束执行后，不能再重新启动
    java程序属于抢占式调度，那个线程的优先级高，那个线程先执行；同一个优先级，随机选择一个执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        // 3.创建Thread类的子类对象
        MyThread mt = new MyThread();

        // 4.调用Thread类中的start()方法，开启新的线程，执行run()方法
        mt.start();

        for(int i = 0; i<20; i++){
            System.out.println("main:" + i);
        }

    }
}
