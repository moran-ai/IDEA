package JAVA多线程.InnerClassThread;

/*
    匿名内部类方式实现线程的创建：
    匿名：没有名字
    内部类：写在其他类内部的类

    匿名内部类的作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象一步完成
        把实现类实现类接口，重写接口中的方法，创建实现类对象一步完成

    匿名内部类的最终产物：子类/实现类对象，而这个类没有名字

    使用格式：
        new 父类/接口(){
            重写父类/接口方法
        }
 */
public class DemoInnerClassThread {
    public static void main(String[] args) {
        // 线程的父类是Thread
        new Thread(){
            @Override
            // 重写run()方法，设置线程任务
            public void run() {
                for (int i =1; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }

            }
        }.start();

        // 实现接口的方式 Runnable
        Runnable r = new Runnable(){
            @Override
            public void run() {
                // 重写run()方法，设置线程任务
                for (int i =1; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + "ee");
                }
            }
        };

        new Thread(r).start();

        // 简化接口的方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 重写run()方法，设置线程任务
                for (int i =1; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + "sss");
                }
            }
        }).start();
    }
}
