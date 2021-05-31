package JAVA多态.格式与使用;

/*
代码当中体现多态性，就是一句话：父类引用指向子类对象
格式：
    父类名称 对象名 = new 子类名称();
    接口名称 对象名 = new 实现类名称();

 */
public class Demo01Multi {
    public static void main(String[] args) {
        // 使用多态
        // 左侧父类的引用指向右侧子类对象
        Fu obj = new Zi();
        obj.mehtod();
        obj.methodFu();
    }
}
