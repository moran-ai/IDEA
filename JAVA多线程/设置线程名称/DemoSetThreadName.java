package JAVA多线程.设置线程名称;

public class DemoSetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("小明");
        mt.start();

        // 另一种方式设置线程名
        new MyThread("???").start();
    }
}
