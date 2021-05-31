package 复习.成员内部类;

public class recall_InnerMain {
    public static void main(String[] args) {
        // 创建内部类对象
        recall_Inner.Inner inner = new recall_Inner().new Inner();

        // 使用内部类的方法
        inner.method();
    }
}
