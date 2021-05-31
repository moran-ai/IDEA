package JAVA多态.对象向上转型;

/*
对象向上转型是安全的，正确的，但是有一个弊端:
    对象一旦向上转型成为父类，就无法调用子类原有的方法
 */
public class DemoMain {
    public static void main(String[] args) {
        // 对象向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
    }
}
