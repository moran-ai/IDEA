package JAVA继承红包案例;

import java.util.ArrayList;

public class Mainredpacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member member = new Member("成员a", 0);
        Member one = new Member("成员b", 0);
        Member two = new Member("成员c", 0);
        manager.show();  // 100
        member.show();   // 0
        one.show();    // 0
        two.show();   // 0
        System.out.println("======================");

        // 发红包 20元，分为3个红包
        ArrayList<Integer> readlist = manager.send(20,3);

        // 收红包
        member.receive(readlist);
        one.receive(readlist);
        two.receive(readlist);

        manager.show();
        member.show();
        one.show();
        two.show();
    }
}
