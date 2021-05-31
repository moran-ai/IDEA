package JAVA泛型;


public class Demo02GenericClass {
    public static void main(String[] args) {
        // 不写泛型，默认为Object类型
        GenericClass gc = new GenericClass();
        gc.setName("字符串类型");
        Object obj = gc.getName();

        // 创建GenericClass对象，使用泛型
        GenericClass<Integer> lc = new GenericClass<>();
        lc.setName(1);
        Integer s = lc.getName();
        System.out.println(s);

        // 创建GenericClass对象，使用泛型
        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("小明");
        String s2 = gc2.getName();
        System.out.println(s2);

    }
}
