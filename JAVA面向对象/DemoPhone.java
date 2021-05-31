package JAVA面向对象;

/*
根据Phone这个类创建一个phe类
1.导包
如果类名称和当前文件在同一目录，导包语句可以省略
 */
public class DemoPhone {
    public static void main(String[] args) {
        // 创建一个对象
        Phone phe = new Phone();

        // 使用成员变量
        // 格式:对象名.成员变量
        phe.brand = "华为";
        phe.price = 10000.08;
        phe.daxiao = "10英寸";
        phe.color = "玫瑰金";
        System.out.println("手机品牌：" + phe.brand);
        System.out.println("手机价格：" + phe.price);
        System.out.println("手机大小：" + phe.daxiao);
        System.out.println("手机颜色：" + phe.color);

        System.out.println("==========");

        // 使用成员方法
        // 格式：对象名.成员方法()
        phe.paizhao();
        phe.playgame();
        phe.dadianhua();
        phe.liaotian("小米");
    }
}

