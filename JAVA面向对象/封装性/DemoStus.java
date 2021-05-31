package JAVA面向对象.封装性;

public class DemoStus {
    public static void main(String[] args) {
        Stus stu1 = new Stus();
        stu1.setName("赵丽颖");
        stu1.setAge(18);
        System.out.println("姓名：" + stu1.getName() + ", 年龄:" + stu1.getAge());

        System.out.println("===========");

        Stus stu2 = new Stus("小明", 20);
        System.out.println("姓名：" + stu2.getName() + ", 年龄:" + stu2.getAge());
        System.out.println("========");
        stu2.setName("小王");
        stu2.setAge(22);
        System.out.println("姓名：" + stu2.getName() + ", 年龄：" + stu2.getAge());
    }
}
