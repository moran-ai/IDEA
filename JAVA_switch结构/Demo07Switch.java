package JAVA_switch结构;

/*
JAVA选择语句  (n选择其一)
格式:
	switch (表达式){
		case 常量值1:
		语句体1;
		break;
		case 常量值2:
		语句体2;
		break;
		...
		default:
		语句体n+1;
		break;
	}
注意事项：
	switch语句使用的注意事项:
	1.多个case后面的数值不可以重复.
	2.switch只能是下列数据类型：
		基本数据类型:byte/short/char/int
		引用数据类型:String字符串，enum枚举
	3.switch语句格式灵活:前后顺序可以颠倒，而且break语句可以省略  【不建议省略】
		"匹配哪一个case就从哪一个位置向下执行，直到遇到break或者整体结束为止."
 */
public class Demo07Switch{
    public static void main(String[] args){
        int number = 1;
        switch (number){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("输入有误!");
                break;  // 最后一个break可省，建议不要省

        }
    }
}
