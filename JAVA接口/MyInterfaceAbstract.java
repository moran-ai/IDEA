package JAVA接口;

/*
在任何java版本中，都能定义抽象方法
格式：
public abstract 返回值类型 方法名称(参数列表);

注意:
    1.接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract
    2.这两个修饰符可以选择性的省略
    3.方法的三要素可以随意定义
 */
public interface MyInterfaceAbstract {
    // 这是一个抽象方法
    public abstract void methodAbs();

    public abstract void methodAbs1();

    void methodAbs2();
}
