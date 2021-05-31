package JAVA线程状态;

/*
    进入到TimeWaiting(计时等待)的两种方式：
        1.使用sleep(long m)方法，在毫秒值结束后，线程睡醒进入Runnable(运行)/Blocked(阻塞)状态
        2.使用wait(long m)方法，wait()方法如果在毫秒值结束后，还没有醒来，会自动醒来，
            线程睡醒进入Runnable(运行)/Blocked(阻塞)状态

    唤醒方法：
        void notify():唤醒单个线程
        void notifyAll():唤醒所有线程
 */
public class Demo1WaitandNotify {
    public static void main(String[] args) {
        // 创建锁对象,保证唯一
        Object obj = new Object();

        // 创建一个顾客线程（消费者） 匿名对象
        new Thread(){
            // 重写object类中的run()方法
            @Override
            public void run() {
                // 顾客一直等待买包子
                while(true){
                    // 保证等待和唤醒的线程只能有一个,需要使用同步代码块
                    synchronized (obj){
                        System.out.println("顾客1：告知老板需要的包子种类和数量");

                        // 调用wait()方法，进入无限等待状态
                        try {
                            // obj.wait(5000);
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 顾客线程被唤醒之后执行的代码
                        System.out.println("老板：包子已经做好了，顾客1可以吃了");
                        System.out.println("==================================");
                    }
                }
            }
        }.start();

        new Thread(){
            // 重写object类中的run()方法
            @Override
            public void run() {
                // 顾客一直等待买包子
                while(true){
                    // 保证等待和唤醒的线程只能有一个,需要使用同步代码块
                    synchronized (obj){
                        System.out.println("顾客2：告知老板需要的包子种类和数量");

                        // 调用wait()方法，进入无限等待状态
                        try {
                            //  obj.wait(5000);
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 顾客线程被唤醒之后执行的代码
                        System.out.println("老板：包子已经做好了，顾客2可以吃了");
                        System.out.println("==================================");
                    }
                }
            }
        }.start();

        // 创建一个老板的线程（生产者）匿名对象
        new Thread(){
            // 重写run()方法
            @Override
            public void run() {
                // 老板一直做包子
                while (true){
                    // 花5秒做包子
                    try{
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }

                    // 保证等待和唤醒的线程只有一个，使用同步代码块
                    synchronized (obj){
                        System.out.println("老板：花了5秒包子，做好包子之后,告诉顾客吃包子");
                        // 调用notify()方法,唤醒顾客线程
//                        obj.notify(); //如果有多个等待线程，随机唤醒一个线程
                        obj.notifyAll();  // 唤醒所有顾客线程
                    }
                }
            }
        }.start();
    }
}
