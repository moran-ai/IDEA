package JAVA面向对象.封装性;

public class DemoStu {
    public static void main(String[] args) {
        Stu stu = new Stu();
        Stu stu1 = new Stu("小明", 23);
        System.out.println("姓名:" + stu1.getName() + ", 年龄:" + stu1.getAge());
        System.out.println("================");
        // 如果需要改变对象当中成员变量的数据类容，仍然需要使用setxx方法
        stu1.setAge(18);
        System.out.println("年龄:" + stu1.getAge());
    }
}
