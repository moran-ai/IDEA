package JAVA面向对象;

/*
定义一个类，模拟手机
 */
public class Phone {
    // 成员变量
    String brand;  // 品牌
    String daxiao;      // 大小
    double price;  // 价格
    String color;  // 颜色

    // 成员方法
    public void paizhao(){
        System.out.println("拍照功能！");
    }

    public void playgame(){
        System.out.println("打游戏功能!");
    }

    public void dadianhua(){
        System.out.println("打电话");
    }

    public void liaotian(String who){
        System.out.println(who + "聊天");
    }
}
