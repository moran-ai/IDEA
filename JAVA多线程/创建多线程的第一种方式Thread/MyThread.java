package JAVA多线程.创建多线程的第一种方式Thread;

/*
1.创建一个Thread类的子类
 */
public class MyThread extends Thread{
    // 2.在Thread类的子类中重写Thread类的run()方法，设置线程任务（开启线程要做什么)

    @Override
    public void run() {
        for(int i = 0; i<20; i++){
            System.out.println("run:" + i);
        }
    }
}
