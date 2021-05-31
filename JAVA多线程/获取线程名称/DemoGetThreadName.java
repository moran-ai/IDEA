package JAVA多线程.获取线程名称;

/*
    线程的名称：
        主线程：main
        新线程：Thread-0,Thread-1,Thread-2...
 */
public class DemoGetThreadName {
    public static void main(String[] args) {
        MyThread th = new MyThread();

        // 开启新线程
        th.start();

        // 获取主线程的名称
        System.out.println(Thread.currentThread().getName()); // main
    }
}
