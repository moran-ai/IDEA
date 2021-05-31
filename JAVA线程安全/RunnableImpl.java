package JAVA线程安全;

/*
    实现卖票功能
 */
public class RunnableImpl implements Runnable {
    // 定义一个多线程共享的票源
    private int ticket = 100;

    // 设置线程任务，卖票
    @Override
    public void run() {
        // 使用死循环，让卖票的动作持续
        while (true) {
            // 判断票是否存在
            if (ticket > 0) {
                // 票存在，卖票
                System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
