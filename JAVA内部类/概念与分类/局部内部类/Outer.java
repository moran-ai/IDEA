package JAVA内部类.概念与分类.局部内部类;

/*
如果一个类是定义在方法内部的，那么这就是一个局部内部类
"局部"：只有当前所属的方法才能使用这个类

定义格式：
    修饰符 class 外部类名称{
        修饰符 返回值类型 外部方法名(参数列表){
            class 局部内部类名称{

            }
        }
    }

类的权限修饰符：
    public > protected > (default) > private
定义一个类时，权限修饰符规则：
1.外部类：public , (default)
2.成员内部类:public , protected , (default) ,private
3.局部内部类： 什么修饰符都不写
 */
public class Outer {
    public void methodOuter(){
        class Inner{  // 局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
