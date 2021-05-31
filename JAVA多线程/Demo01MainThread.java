package JAVA多线程;

/*
    主线程：执行(main)主方法的线程
    单线程程序：java程序中只有一个线程
    执行方法从main方法开始，从上至下依次执行
    JVM执行Main方法，main方法会进入栈内存，JVM会让操作系统开辟一条main方法通向
    cpu的路径，cpu就可以通过这个路径来执行main方法，而这个路径就叫main(主)线程
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();
        System.out.println("=========================");
        Person p2 = new Person("小小");
        p2.run();
    }
}
