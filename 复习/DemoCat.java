package 复习;

public class DemoCat {
    public static void main(String[] args) {
        Cat t = new Cat("猫", 20, "120", "23");
        System.out.println("姓名：" + t.getName());
        System.out.println("年龄：" + t.getAge());
        System.out.println("身高：" + t.getWeigth());
        System.out.println("体重：" + t.getHeight());
    }
}
