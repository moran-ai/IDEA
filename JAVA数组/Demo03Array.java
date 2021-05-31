package JAVA数组;

/*
静态初始化的省略格式：
    数据类型[] 数组名称 = {元素1, 元素2, 元素3...};

静态初始化的标准格式:
    数据类型[] 数组名称 = new 数据类型[] {元素1, 元素2, 元素3...};

注意事项：
    1.静态初始化没有直接指定长度，但是仍然会自动推算长度
    2.静态初始化标准格式可以拆分为两个步骤
    3.动态初始化也可以拆分长两个步骤
    4.静态的省略格式不能拆分为两个步骤

使用建议：如果不确定数组当中的具体内容，用动态初始化；否则，使用静态初始化
 */
public class Demo03Array {
    public static void main(String[] args) {
        // 静态省略格式的静态初始化
        int[] arrayA = {10, 20, 30};

        // 静态初始化的标准格式，可以差分为两个步骤
        int[] arrayB;
        arrayB = new int[] {11, 21, 31};

        // 动态初始化拆分为两个步骤
        int[] arrayC;
        arrayC = new int[10];

        // 错误写法！
        // 静态初始化的省略格式，不能拆分为两个步骤
//        int[] arrayD;
//        arrayD = {10, 20, 30};
    }
}
