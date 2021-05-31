package JAVA异常.自定义异常;

import java.util.Scanner;

/*
自定义异常，模拟注册操作，如果用户名已存在，给出提示，该用户名已注册
分析：
    1.使用数组保存已经注册过的用户名
    2.使用Scanner获取用户输入
    3.定义一个方法，对用户输入的注册的用户名进行判断
        遍历存储已经注册过用户名的数组，获取每一个用户名
        使用获取到的用户名和输入的用户名进行比较：
            true:
                用户名已经存在，抛出异常RegisterException，告诉用户，用户名已注册
            false:
                继续遍历比较
        如果循环结束，还没有找到重复的用户名，提示用户：注册成功

 */
public class DemoRegisterException {
    // 使用数组保存已注册过的用户名
    static String [] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) throws RegisterException{
        // 使用Scanner获取用户的输入
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = input.next();
        check(username);
    }

    // 义一个方法，对用户输入的注册的用户名进行判断
    public static void check(String username) throws RegisterException{
        // 遍历存储已经注册过用户名的数组，获取每一个用户名
        // 增强型for循环
        for (String name : usernames) {
            // 使用获取到的用户名和输入的用户名进行比较
            if (name.equals(username)){
                // true:用户名已经存在，抛出异常RegisterException，告诉用户，用户名已注册
                throw new RegisterException("该用户名已注册");
            }
        }
        System.out.println("注册成功！");
    }
}
