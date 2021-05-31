package 复习.匿名内部类;

/*
匿名内部类:
    如果接口的实现类 （父类的子类）只需要使用唯一的一次
    那么可以省略该类的定义，使用匿名内部类

匿名内部类的的定义格式：
    接口名称 对象名 = new 接口名称(){
      // 覆盖重写所有的抽象方法
    };

对 new 接口名称{...}进行解析
1.new 代表创建对象的动作
2.接口名称代表匿名内部类需要实现那个接口
3.{...}匿名内部类的内容

注意：
    1.匿名内部类，在使用时只能创建一次
    如果需要多次使用，只能通过实现类
    2.匿名对象在调用方法时，只能调用唯一一次
    如果需要多次调用，必须给对象命名
    3.匿名内部类省略了【实现类或子类】，匿名对象省略了【对象名称】
     匿名内部类和匿名对象不是一回事
 */
public class recall_Inter {
    public static void main(String[] args) {
        // 创建匿名内部类
        recall_method recall_method = new recall_method() {
            @Override
            public void method1() {
                System.out.println("覆盖重写抽象方法 11111111");
            }

            @Override
            public void method2() {
                System.out.println("覆盖重写抽象方法 22222222");
            }
        };
        recall_method.method1();
        recall_method.method2();
        System.out.println("===================================");

        // 使用匿名对象和匿名内部类
        new recall_intermethod(){
            @Override
            public void method1(){
                System.out.println("匿名对象和匿名内部类 111");
            }

            @Override
            public void method2(){
                System.out.println("匿名对象和匿名内部类 222");
            }
        }.method1();
    }
}
