package JAVA面向对象.封装性;

public class DemoDog {
    public static void main(String[] args) {
        Dog dog = new Dog("黄豆", 12);
        System.out.println("名字：" + dog.getName() + ", 年龄:"+ dog.getAge());

    }
}
