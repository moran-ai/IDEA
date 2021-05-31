package JAVA多态.成员方法使用特点;

/*
在多态代码中，成员方法的访问规则：
    new的是谁，优先用谁
口诀：编译看左，运行看右
成员变量：编译看左，运行看左
成员方法：编译看左，运行看右
 */
public class DemoMultiMethod {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();
        obj.methodFu();
    }
}
