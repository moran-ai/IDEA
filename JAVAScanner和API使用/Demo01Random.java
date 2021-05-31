package JAVAScanner和API使用;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(10);  // 取值在0-9之间的随机数
            System.out.println(num);
        }
    }
}

