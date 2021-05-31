package JAVA面向对象;

/*
当使用一个对象作为方法的返回值时，返回值其实就是对象的地址值
 */
public class DemoPhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone(); // 创建一个接收返回值的变量
        System.out.println(two.brand);
        System.out.println(two.daxiao);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    // 对象作为返回值
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "华为";
        one.daxiao = "10英寸";
        one.price = 123412.4;
        one.color = "玫瑰金";
        return one;
    }
}
