package 复习.局部内部类;

/*
局部内部类：
    类定义在方法的内部
    局部：只有这个方法才能使用这个类

定义格式：
    修饰符 class 外部类名称{
        修饰符 返回值类型 外部方法名(参数列表){
            class 局部内部类名称{

            }
        }

    }

类的权限修饰符
    public > protected > (default) > private

定一个类时，类的权限修饰符的定义规则：
    1.外部类：public , (default)
    2.成员内部类：public , protected , (default), private
    3.局部内部类：什么都不用写
 */
public class recall_Outer {
    // 定义局部内类
    public void method(){
        class Outer{
            int num = 10;
            // 局部内部类的方法
            public void method(){
                System.out.println(num);
            }
        }

        // 创建局部内部类的对象
        Outer outer = new Outer();
        outer.method();
    }
}