package JAVAif结构;

/*
if-else语句替换三元运算符
*/
public class Demo06Max{
    public static void main(String[] args){
        int a = 105;
        int b = 20;

        // 首先使用运算符
        //int max = a > b ? a : b;
        //System.out.println("最大值：" + max);

        // 使用if语句
        int max;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        System.out.println("最大值是：" + max);
    }
}
