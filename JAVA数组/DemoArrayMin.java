package JAVA数组;

public class DemoArrayMin {
    public static void main(String[] args) {
        int[] array = {5, 10, 30, 20, 1000};

        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("最小值为：" + min);
    }
}
