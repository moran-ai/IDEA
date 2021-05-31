package 复习.成员内部类;

/*
外部类与内部类成员变量出现重名的情况，如何访问外部类变量
格式：
    外部类名称.this.外部类成员变量名;
 */
public class recall_Inner {
    // 外部类变量
    int num = 10;

    // 成员内部类
    public class Inner{
        // 成员内部类变量
        int num = 20;

        // 内部类的成员方法
        public void method(){
            int num = 30; // 内部类方法的局部变量
            System.out.println(num);  // 局部变量 30
            System.out.println(this.num); // 内部类的成员变量  20
            System.out.println(recall_Inner.this.num); // 外部类的成员变量 10
        }
    }
}
