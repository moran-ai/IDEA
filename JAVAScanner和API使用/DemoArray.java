package JAVAScanner和API使用;

/*
对象数组

定义一个数组，用来存储3个person对象
数组的缺点：一旦创建，程序运行期间长度不可改变
 */
public class DemoArray {
    public static void main(String[] args) {
        // 首先创建一个数组长度为3的数组，里面存放per类型的对象
        Per[] array = new Per[3];

        Per one = new Per("赵丽颖", 18);
        Per two = new Per("网", 22);
        Per three = new Per("fg", 45);

        array[0] = one;
        array[1] = two;
        array[2] = three;

//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

        Per person = array[1];
        System.out.println(person.getName());


    }

}
