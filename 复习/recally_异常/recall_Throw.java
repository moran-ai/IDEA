package 复习.recally_异常;

public class recall_Throw {
    public static void main(String[] args) {
        int [] array = null;
        int e = getElement(array, 3);
        System.out.println(e);
    }

    public static int getElement(int [] arr, int index){
        if(arr == null){
            throw new NullPointerException("传递的数组值为null");
        }

        if(index < 0 || index > arr.length - 1){
            throw new IndexOutOfBoundsException("数组索引越界");
        }

        int ele = arr[index];
        return ele;
    }
}
