package JAVA数组;

/*
遍历数组：将数组中的每一个元素逐一打印出来
 */
public class DemoArrayBianLi {
    public static void main(String[] args) {
        int[] array = {15, 25, 30, 40, 40, 50, 60};

        // 首先使用原始方式遍历
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println("===========");

        // 循环变遍历
        for (int i = 0; i < 4; i++) {
            System.out.println(array[i]);
        }
        System.out.println("============");

        // 循环遍历
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("===========");

        int len = array.length;
        for (int i = 0; i < len; i++) {
            System.out.println(array[i]);
        }

    }
}
