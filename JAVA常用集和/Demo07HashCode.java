package JAVA常用集和;

/*
    哈希值:是一个十进制的整数，由系统随机给出（对象的地址值，是一个逻辑地址，是模拟出来的地址，不是
    实际存储的物理地址）
    在Object类中有一个方法，可以获取哈希值
    int hashCode() 返回对象的哈希码值
    hashCode()方法的源码：
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */

public class Demo07HashCode {
    public static void main(String[] args) {
        Person p1 = new Person("小王", 78);
        int t = p1.hashCode();
        System.out.println(t);

        Person p2 = new Person("下课", 34);
        int i = p2.hashCode();
        System.out.println(i);

    }
}
