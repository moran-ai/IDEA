package JAVA多线程.创建多线程的第二种方式Runnable;

/*
    创建多线程程序的第二种方式：实现Runnable接口
    java.lang.Runnable
        Runnable接口应该由那些打算通过某一线程执行其实例的类来实现，类必须定义一个称为run的无参数方法

    java.lang.Thread类的构造方法
        Thread(Runnable target):分配新的Thread对象
        Thread(Runnable target, String name):分配新的Thread对象

    实现步骤：
        1.创建一个Runnable接口的实现类
        2.在实现类中重写Runnable接口的run()方法，设置线程任务
        3.创建一个Runnable接口的实现类对象
        4.创建Thread对象，构造方法中传递Runnable接口的实现类对象
        5.调用Thread类中的start()方法，开启新的线程执行run()方法

    实现Runnable接口创建多线程程序的好处：
        1.避免了单继承的局限性
            一个类只能继承一个类，类继承了Thread类就不能继承其他类
            实现Runnable接口，还可以继承其他类，实现其他的接口

        2.增强了程序扩展性，降低了程序的耦合性（解耦）
            实现Runnable接口的方式，把设置线程任务和开启线程进行了分离（解耦）
            实现类中重写了run()方法，用来设置线程任务
            主方法中创建了Thread对象，调用start()方法，用来开启新的线程
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        // 3.创建一个Runnable接口的实现类对象
        RunnableImpl impl = new RunnableImpl();

        // 4.创建Thread对象，构造方法中传递Runnable接口的实现类对象
        Thread th = new Thread(impl);

        // 5.调用Thread类中的start()方法，开启新的线程执行run()方法
        th.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
