package JAVA线程安全.解决线程安全问题.同步方法;

/*
    卖票案例出现了线程线程安全问题：出现了不存在的票和重复的票

    解决线程安全问题的第二种方案：使用同步方法
    使用：
        1.把访问了共享数据的代码块拿出来，放在一个方法中
        2.在方法上添加一个synchronized的修饰符

     格式：
        定义方法的格式：
            修饰符 synchronized 返回值类型 方法名称(参数列表){
                访问了共享数据的代码
            }


 */
public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 创建一个锁对象，锁对象可以是任意的对象
    Object obj = new Object();

    // 设置线程任务，卖票
    @Override
    public void run() {
        // 使用死循环，让卖票的动作持续
        while (true) {
            // 同步代码块
//            synchronized (obj) {
//
//            }
            palyID();
        }
    }

    // 定义一个同步方法
    /*
    同步方法也会把方法内部的代码锁住，只让一个线程执行。
    同步方法的锁对象是实现类对象，本例中是 new RunnableImpl() 也就是this
     */
    public /*synchronized*/ void palyID(){
        synchronized (this){
            // 判断票是否存在
            if (ticket > 0) {
                // 票存在，卖票
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }

    }
}
