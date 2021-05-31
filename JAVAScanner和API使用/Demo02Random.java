package JAVAScanner和API使用;


import java.util.Random;

/*
根据int变量，来获取随机数字，范围是[1,n]，可以取到1和n

 1.定义一个int变量n,随意赋值
 如果求0-10之间的随机数，整体加1
 */
public class Demo02Random {
    public static void main(String[] args) {
        int n = 5;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // 本来是0-n,整体加1后，就变成了1,n+1
            // 可以两边都取到
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
