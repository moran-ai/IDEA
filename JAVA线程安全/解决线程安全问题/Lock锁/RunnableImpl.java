package JAVA线程安全.解决线程安全问题.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    实现卖票功能
    线程安全的第三种解决方案：Lock锁
    java.util.concurrent.Locks.Lock接口
    Lock锁比使用Synchronized更先进

    Lock接口中的方法：
        void lock() 获取锁
        coid unlock() 释放锁

    Lock接口的实现类：
        java.util.concurrent.Locks,Reentrantiock implements Lock接口

    使用步骤:
        1.在成员位置创建一个Reentrantiock对象
        2.在可能出现线程安全问题的代码之前调用Lock接口中的方法lock()获取锁
        3.在可能出现线程安全问题的代码之后调用Lock接口中的方法unlock()释放锁
 */
public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 1.在成员位置创建一个Reentrantiock对象
    Lock l = new ReentrantLock();

    // 设置线程任务，卖票
    @Override
    public void run() {
        // 使用死循环，让卖票的动作持续
        while (true) {
            // 2.在可能出现线程安全问题的代码之前调用Lock接口中的方法lock()获取锁
            l.lock();

            // 判断票是否存在
            if (ticket > 0) {
                try{
                    // 可能出现线程安全问题的代码
                    // 线程睡眠10秒
                    Thread.sleep(10);
                    // 票存在，卖票
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    // 3.在可能出现线程安全问题的代码之后调用Lock接口中的方法unlock()释放锁
                    l.unlock(); // 程序是否出现异常，都会释放锁
                }
            }
        }
    }

//    // 设置线程任务，卖票
//    @Override
//    public void run() {
//        // 使用死循环，让卖票的动作持续
//        while (true) {
//            // 2.在可能出现线程安全问题的代码之前调用Lock接口中的方法lock()获取锁
//            l.lock();
//
//            // 判断票是否存在
//            if (ticket > 0) {
//                // 票存在，卖票
//                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
//                ticket--;
//            }
//            // 3.在可能出现线程安全问题的代码之后调用Lock接口中的方法unlock()释放锁
//            l.unlock();
//        }
//    }
}
