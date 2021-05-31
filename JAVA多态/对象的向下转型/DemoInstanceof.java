package JAVA多态.对象的向下转型;

/*
如何知道父类所引用的子类对象本来是什么样的
格式：
    对象 instanceof 类名称
会得到一个boolean值，判断前面的对象能不能作为后面类型的实例
 */
public class DemoInstanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();  // 本来是一只猫
        animal.eat();

        // 向下转型
        // 判断父类引用的animal是不是DOg
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        // 判断父类引用的animal是不是Cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        getAnPet(new Dog());
    }

    public static void getAnPet(Animal animal){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
