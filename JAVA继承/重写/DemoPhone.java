package JAVA继承.重写;

public class DemoPhone {
    public static void main(String[] args) {
        // 父类对象
        Phone p = new Phone();
        p.call();
        p.send();
        p.show();
        System.out.println("================");

        // 子类对象
        NewPhone nwp = new NewPhone();
        nwp.call();
        nwp.show();
        nwp.send();
    }
}
