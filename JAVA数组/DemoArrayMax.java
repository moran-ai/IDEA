package JAVA数组;

public class DemoArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 10, 30, 20, 1000};

        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
