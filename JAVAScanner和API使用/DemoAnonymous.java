package JAVAScanner和API使用;

import JAVA面向对象.封装性.Per;

/*
匿名对象:只有右边的对象，没有左边的名字和赋值运算符
创建对象的标准格式：
    类名称 对象名= new 类名称();

创建匿名对象的格式：
    new 类名称();
注意事项：
    匿名对象只能使用唯一的一次，下次再用要再次创建新对象
使用建议：如果确定一个对象只需要使用一次，就可以用匿名对象
 */
public class DemoAnonymous {
    public static void main(String[] args) {
        // one为对象名
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("==========");

        // 匿名对象
        new Person().name = "赵";
        new Person().showName();
    }
}
