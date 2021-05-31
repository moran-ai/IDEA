package JAVA内部类.概念与分类.成员内部类的定义;


public class DemoMain {
    public static void main(String[] args) {
        // 内部类的间接使用
        Body body = new Body();  // 外部类的对象
        body.setName("小明");
        // 通过外部类的对象，调用外部类的方法，间接使用内部类Heart
        body.methodBody();
        System.out.println("===============");

        // 内部类的直接使用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
