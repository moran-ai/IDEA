package JAVA数据类型转换;

/*
数据类型-强制转换
	1.特点：代码需要进行特殊的格式处理，不能自动完成
	2.格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的数据
*/
public class Demo02DataType{
    public static void main(String[] args){
        // 左边是int类型，右边是Long类型
        // long -- > int,不是从小到大
        // 不能自动类型转换
        // 强制转换
        int num = (int) 100L;
        System.out.println(num);

        // long强制转换为int类型
        int num2 = (int) 6000000000L;
        System.out.println(num2); // 输出 1705032704,发生了数据溢出

        // double --> int
        int num3 = (int) 3.5;
        System.out.println(num3);  // 输出3，发生精度损失

        char zifu1 = 'A'; // 这是一个字符型变量，里面是大写字母A
        System.out.println(zifu1 + 1); // 输出 66 也就是大写字母被当作65进行处理
        // 计算机的底层会用一个数字（二进制）来代表字符A，就是65
        // 一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成一个数字

        byte num4 = 40; // 注意！ 右侧的数值大小不能超过左侧的类型范围
        byte num5 = 50;
        // byte + byte --> int + int --> int
        int result = num4 + num5;
        System.out.println(result);  // 输出90

        // num6 为short类型
        short num6 = 60;
        // byte + short --> int + int --> int
        // num4 是byte类型
        // num4(byte)和num6(short)在进行运算时都会先转换为int类型，在进行计算
        // int result2 = num4 + num6 ;  num4+num6为int类型，结果由result接收，类型也为int类型
        // int 强制转换为short ；注意必须保证逻辑上真实大小本来就没有超过short范围，否则就会发生数据溢出
        short result2 = (short) (num4 + num6);  // num4+num6 为int类型，强制转换为short类型,结果由result2接收，也为short类型
        // 在进行运算时，左右两边的数据类型要相同
        System.out.println(result2);

    }
}
