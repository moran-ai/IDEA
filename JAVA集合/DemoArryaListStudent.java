package JAVA集合;

import java.util.ArrayList;

/*
自定义四个学生对象，添加到集合，并遍历
 */
public class DemoArryaListStudent {
    public static void main(String[] args) {
        Student n = new Student();

        // 创建四个学生对象
        Student one = new Student("小王", 20);
        Student two = new Student("小红", 22);
        Student three = new Student("小明", 24);
        Student four = new Student("小力", 26);

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 将学生对象添加到集合
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);


         // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ", 年龄：" + stu.getAge());
        }

    }
}
