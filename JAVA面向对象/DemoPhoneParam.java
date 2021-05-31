package JAVA面向对象;

/*
当一个对象作为参数时，传递到方法当中时，实际上传递进去的是【地址值】
 */
public class DemoPhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "华为";
        one.daxiao = "10英寸";
        one.price = 123456.7;
        one.color = "玫瑰金";

        method(one);  // 传递进去的是地址值
    }

    // 对象作为参数
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.daxiao);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
