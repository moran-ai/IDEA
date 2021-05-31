package JAVA多态.成员变量使用特点;

/*
访问变量的两种方式：
1.直接访问：等号左边是谁，优先用谁
2.间接访问：该方法属于谁，优先用谁
 */
public class DemoMultiField {
    public static void main(String[] args) {
        // 使用多态
        Fu obj = new Zi();
        System.out.println(obj.num);
        System.out.println("===============");
        obj.show();
    }
}
