package JAVA多态.对象的向下转型;

import JAVA多态.对象向上转型.Animal;
import JAVA多态.对象向上转型.Cat;

/*
对象向上转型是安全的，正确的，但是有一个弊端:
    对象一旦向上转型成为父类，就无法调用子类原有的方法
 */
public class DemoMain {
    public static void main(String[] args) {
        // 对象向上转型，就是父类引用指向子类对象
        Animal animal = new Cat();  // 本来创建的时候就是一只猫
        animal.eat();

        // 对象向下转型,还原成猫，可以调用子类特有的方法
        Cat cat = (Cat) animal;
        cat.catchMouse();  // 还原成功

        /*
        下面是错误的向下转型
        本来是一只猫，非要转成一只狗
         */
        /*
        Dog dog = (Dog) animal;
        dog.watchHouse();
        */
    }
}
