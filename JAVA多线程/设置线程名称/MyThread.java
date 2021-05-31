package JAVA多线程.设置线程名称;

/*
    设置线程名称：
        1.使用Thread类中的setName(名字)方法
            void setName(String name) 改变线程名称，使之与参数name相同
        2.创建一个带参数的方法，参数传递线程的名称，调用父类的带参构造方法，把线程名称传递给父类
          让父类（Thread）给子类起一个名字
                Thread(String name) 分配新的Thread对象
 */
public class MyThread extends Thread{
    public MyThread(){

    }

    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        // 获取线程名
        System.out.println(Thread.currentThread().getName());
    }
}
