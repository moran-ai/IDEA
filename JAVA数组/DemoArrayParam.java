package JAVA数组;

/*
数组可以作为方法的参数
当调用方法的时候，向方法的小括号里进行传参，传递进去的其实是数组的地址值
 */
public class DemoArrayParam {
    public static void main(String[] args) {
        int [] array = {1, 20, 30 ,4, 3, 5, 6, 7};
        System.out.println(array);  // 地址值
        // 对数组进行反转
//        for (int min = 0, max = array.length-1; min < max; min++, max--){
//            int t = array[min];
//            array[min] = array[max];
//            array[max] = t;
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

        printArray(array);  // 传递进去的array是保存的地址值

    }

    /*
    三要素：
        返回值类型：
        方法名称
        参数列表
     */
     
    public static void printArray(int[] array){
        System.out.println("printArray方法收到的是：");
        System.out.println(array);  // 地址值
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
