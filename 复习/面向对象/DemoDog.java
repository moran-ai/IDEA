package 复习.面向对象;

public class DemoDog {
    public static void main(String[] args) {
        // 创建dog对象
        Dog dog = new Dog("赵", 12, "10公斤", "50厘米");
        System.out.println("姓名：" + dog.getName());
        System.out.println("年龄：" + dog.getAge());
        System.out.println("身高：" + dog.getWeight());
        System.out.println("体重：" + dog.getHeight());
    }
}
