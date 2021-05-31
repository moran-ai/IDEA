package 复习.局部内部类;

public class recall_Main {
    public static void main(String[] args) {
        // 创建外部类对象
        recall_Outer recall_outer = new recall_Outer();
        recall_outer.method(); // 间接使用局部内部类
    }
}
