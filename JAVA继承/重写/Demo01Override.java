package JAVA继承.重写;

/*
重写的注意事项：
    1.必须保证父类和子类的方法名称相同，参数列表也相同

    2.@Override:写在方法前面，用来检测方法覆盖重写是否正确,这个注解不写，只要满足要求，也是可以的

    3.子类方法的返回值必须小于等于父类方法的返回值
    java.lang.Object是所有类的最高公共类，java.lang.String是它的子类.

    4.子类方法的权限必须大于等于父类方法的权限
    public > protected > (default) > private
    (default)不是关键字，而是什么都不写，留空
 */
public class Demo01Override {

}
