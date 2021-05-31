package JAVA面向对象.封装性;

/*
面向对象三大特征：封装、继承、多态

封装在JAVA中的体现：
    1.方法就是一种封装
    2.关键字private也是一种封装

封装就是将一些细节信息隐藏起来，对于外界不可见
 */
public class Method {
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 25, 100};
        getMax(array);

        // 取反
//        for (int min = 0, max = array.length-1; min < max; min++,max--) {
//            int temp = array[min];
//            array[min] = array[max];
//            array[max] = temp;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }

    // 求最大值
    public static int getMax(int[] array){
        // for循环实现
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }

        }
        System.out.println("最大值是:"+ max);
        return max;

        // while循环实现
//        int max = array[0];
//        int i = 1;
//        while (i < array.length){
//            if (array[i] > max){
//                max = array[i];
//                i++;
//            }
//        }
//        System.out.println("最大值是：" + max);
//        return max;

        // do-while循环实现
//        int max = array[0];
//        int i = 1;
//        do{
//            if (array[i] > max){
//                max = array[i];
//            }
//            i++;
//        } while (i < array.length);
//        System.out.println("最大值为：" + max);
//        return max;

    }
}
