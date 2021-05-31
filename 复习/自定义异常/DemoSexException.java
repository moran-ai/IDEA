package 复习.自定义异常;

import java.util.Scanner;

public class DemoSexException {
    static String [] usernames = {"张三", "李四", "王梅"};

    public static void main(String[] args) throws SexException{
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        // 调用了一个带有异常的方法，需要处理这个异常
        check(name);
    }

    // 定义了一个check()方法，用来抛出异常
    public static void check(String username) throws SexException{
        for(String name : usernames){
            if (name.equals(username)){
                throw new SexException("该用户名已注册");
            }
        }
    }
}
