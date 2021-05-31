package JAVA运算符;

/*
与(并且)  &&   全都是true,才是true;否则就是false
或(或者)  ||   至少一个是true,就是true;全部都是false,才是false
非(取反)  !    本来是true，变成false;本来是flase,变成true
与“&&”, 或“||”,具有短路效果；如果根据左边已经可以判断得到最终结果，
那么右边的代码不再执行，从而节省一定的性能
注意事项：
	1.逻辑运算符只能用于boolean值
	2.与，或需要左右两边各自有一个boolean值，但是取反只要有唯一的一个boolean值即可
	3.与，或两种运算符，如果有多种条件，可以连续写。
	两个条件：条件A && 条件B
	多个条件：条件A && 条件B && 条件C
	提示：
		对于 1 < x < 3 的情况，应该拆成两个部分，然后使用与运算符连接起来
		int x = 2;
		1 < x && x < 3;
*/
public class Demo09Logic{
    public static void main(String[] args){
        System.out.println(true && false);  // 输出false

        System.out.println(3 < 4 && 10 > 5); // 输出true  与
        System.out.println("=============");
        System.out.println(true || false);  // 输出true   或
        System.out.println(true || true);  // 输出true   或
        System.out.println(false || false);  // 输出false  或
        System.out.println("=============");

        // 非 !
        System.out.println(true);
        System.out.println(!true);  // 取反  变为false

        System.out.println("=============");

        int a = 10;  // 与 && 一个为false ，全都是false
        // false  发生了短路，左边的代码已经得出了结果为false,右边的代码不会被执行
        System.out.println(3 > 4 && ++a < 100);
        System.out.println(a); // 输出10

        System.out.println("==============");

        // 或 || 一个为true，全都为true
        int b = 20;
        // 输出true 发生了短路，左边的代码已经得出了结果为true，右边的代码不会被执行
        System.out.println(3 < 4 || ++b < 100);
        System.out.println(b); // 输出20

    }
}