package JAVA继承红包案例;

import java.util.ArrayList;
import java.util.Random;

/*
普通成员
 */
public class Member extends  User {
    public Member(){

    }

    public Member(String name, int money){
        super(name, money);
    }

    // 收红包的方法
    public void receive(ArrayList<Integer> list){
        // 从多个红包中，随机抽取一个
        // 随机获取集合中的一个索引编号
        int index = new Random().nextInt(list.size());

        // 根据索引，从集合中删除，并得到删除的红包
        int delta = list.remove(index);

        // 当前成员的钱
        int money = super.getMoney();

        // 重新设置钱数
        super.setMoney(money + delta);
    }
}
