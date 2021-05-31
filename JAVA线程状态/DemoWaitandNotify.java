package JAVA线程状态;

/*
等待唤醒案列：线程之间的通信
    创建一个顾客线程（消费者）：告知老板要买的包子种类和数量，调用wait()方法，
                              放弃cpu的执行权，进行WAITING状态（无限等待状态）
    创建一个老板线程（生产者）：花了5秒包子，做好包子之后，调用notify()方法，唤醒顾客线程'

注意：
    顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
    同步使用的锁对象必须保证是唯一的
    只有锁对象才能调用wait()方法和notify()方法

    Object类中的方法
    void wait():
        在其他线程调用此对象的notify()或者notifyAll()方法前，使当前线程等待
    void notify():
        唤醒此对象监视器上的某个线程
        会继续执行wait()方法之后的代码
 */
public class DemoWaitandNotify {
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
                        System.out.println("顾客：告知老板需要的包子种类和数量");

                        // 调用wait()方法，进入无限等待状态
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        // 顾客线程被唤醒之后执行的代码
                        System.out.println("老板：包子已经做好了，可以吃了");
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
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
