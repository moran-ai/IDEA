package JAVA面向对象.封装性;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("小明");
        stu.setAge(18);
        stu.setMale(true);

        System.out.println("姓名:" + stu.getName());
        System.out.println("年龄:" + stu.getAge());
        System.out.println("是不是男的:" + stu.isMale());
    }
}
