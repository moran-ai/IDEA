package JAVA面向对象;

/*
根据Phone这个类创建一个phe类
1.导包
如果类名称和当前文件在同一目录，导包语句可以省略
 */
public class DemoPhoneTwo {
    public static void main(String[] args) {
        Phone phe = new Phone();

        phe.brand = "华为";
        phe.price = 10000.08;
        phe.daxiao = "10英寸";
        phe.color = "玫瑰金";
        System.out.println("手机品牌：" + phe.brand);
        System.out.println("手机价格：" + phe.price);
        System.out.println("手机大小：" + phe.daxiao);
        System.out.println("手机颜色：" + phe.color);
        System.out.println("==========");

        phe.paizhao();
        phe.playgame();
        phe.dadianhua();
        phe.liaotian("小米");

        System.out.println("***************");
        Phone Two = new Phone();
        Two.brand = "苹果";
        Two.price = 8000.08;
        Two.daxiao = "15英寸";
        Two.color = "白色";
        System.out.println("手机品牌：" + Two.brand);
        System.out.println("手机价格：" + Two.price);
        System.out.println("手机大小：" + Two.daxiao);
        System.out.println("手机颜色：" + Two.color);
        System.out.println("==========");

        Two.paizhao();
        Two.playgame();
        Two.dadianhua();
        Two.liaotian("马化腾");
    }
}
