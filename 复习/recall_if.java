package 复习;

public class recall_if {
    public static void main(String[] args) {
        // if语句计算1-100之间的偶数和
        int sum = 0;
        int sum_ = 0;
        for (int i = 0; i <= 100; i++){
            if ( i % 2 == 0){
                sum += i;
            } else {
                if (i % 2 != 0){
                   sum_ += i;
                }
            }
        }
        System.out.println("偶数和是：" + sum);
        System.out.println("奇数和是：" + sum_);
    }
}
