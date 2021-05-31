package JAVA泛型;

/*
测试含有泛型的方法
 */
public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gc = new GenericMethod();

        /*
        调用含有泛型的方法
        传递什么类型，泛型就是什么类型
         */
        gc.mehtod01(12);
        gc.mehtod01("01");
        gc.mehtod01(8.9);
        gc.mehtod01(true);
        System.out.println("================");
        gc.mehtod02("静态方法，不建议创建对象调用");

        // 静态方法，通过类名.静态方法名直接使用
        GenericMethod.mehtod02("111");
    }
}
