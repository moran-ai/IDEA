package JAVA继承红包案例;

import java.util.ArrayList;

/*
群主类
 */
public class Manager extends User {
    public Manager(){
        // super();
    }

    public Manager(String name, int money){
        super(name, money);
    }

    // 定义发红包的方法
    public ArrayList<Integer> send (int totalMoney, int count){
        // 创建一个集合，用来存储若干个红包的金额
        ArrayList<Integer> readList = new ArrayList<>();

        // 查看群主有多少钱
        int leftMoney = super.getMoney();

        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return readList; // 返回空集合
        }

        // 扣钱,重新设置余额
        super.setMoney(leftMoney - totalMoney);

        // 发红包平均拆分为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，甩下的零头

        // 除不开的零头,包在最后一个红包里
        // 把红包一个一个放入集合中
        for (int i = 0; i < count - 1; i++){
            readList.add(avg);
        }

        // 最后一个红包
        int last = avg + mod;
        readList.add(last);

        return readList;
    }
}
