package JAVA方法;

/*
方法是若干语句的集合

参数：进入方法的数据
返回值：从方法中出来的数据

定一个方法的完整格式：
    修饰符 返回值类型 方法名称(参数类型 参数名称,...){
        方法体
        return 返回值;
    }
    修饰符： 现阶段的固定写法 : public static
    返回值类型：方法最终产生的数据类型是什么类型
    方法名称：方法的名字，规则和变量一样，小驼峰
    参数类型：进入方法的数据是什么类型
    参数名称：进入方法的数据对应的变量名称
 备注：参数如果有多个，使用逗号分隔
 方法体：方法需要做的事情，若干行代码
 return:两个作用，一个是停止当前方法，第二个是将后面的结果数据返回值还给调用处
 返回值：方法执行后最终产生的数据结果

注意事项：
 return 后面的【返回值】，必须和方法名称前的【返回值类型】对应

 定义一个两个int数字相加的方法:三要素:
 1.返回值类型 int
 2.方法名称 sum
 3.参数列表 int a , int b
 */
/*

方法的调用三种格式;
    1.单独调用: 方法名称（参数）
    2.打印调用: System.out.println(方法名称(参数))
    3.赋值调用: 数据类型 变量名称 = 方法名称(参数)
 此前学习的方法，返回值类型固定写为void,这种方法只能单独调用，不能进行打印调用或者赋值调用
 */

public class DemoMethodDefine {
    public static void main(String[] args){
        // 单独调用
        sum(3, 4);
        System.out.println("========");

        // 打印调用
        System.out.println(sum(3 ,4));
        System.out.println("==========");

        // 赋值调用
        int num = sum(40, 50);
        num += 100;
        System.out.println("变量的值："+num);
    }

    public static int sum(int a , int b){
        System.out.println("方法执行啦!");
        int result =  a + b;
        //System.out.println(result);
        return result;
    }
}
