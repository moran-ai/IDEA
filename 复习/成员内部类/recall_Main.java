package 复习.成员内部类;

public class recall_Main {
    public static void main(String[] args) {
        // 使用成员内部类
        // 1.直接使用
        // 格式: 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        recall_demo.demo de = new recall_demo().new demo();
        de.beat();
        System.out.println("===============================================");
        // 创建外部类对象 间接使用内部类
        recall_demo recall_demo = new recall_demo();
        recall_demo.setName("hao de ");
        recall_demo.ddd();
    }
}
