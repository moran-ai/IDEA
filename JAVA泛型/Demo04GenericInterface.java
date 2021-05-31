package JAVA泛型;

/*
    测试含有泛型的接口
 */
public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gc = new GenericInterfaceImpl();
        gc.method01("小明");

        // 创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gc2 = new GenericInterfaceImpl2<>();
        gc2.method01(12);
    }

}
