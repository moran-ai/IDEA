package 复习.成员内部类;

/*
成员内部类的定义格式：
    修饰符 class 外部类名称{
        修饰符 class 内部类名称{

         }
    }
注意：内用外，随意访问，外用内，需要借助内部类对象

使用成员内部类，有两种方式：
    1.间接使用：在外部类的方法中，使用内部类，外后main方法调用外部类的方法
    2.直接使用：
        格式：
            外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();

 */
public class recall_demo {
    // 成员内部类
    public class demo {
        // 成员内部类的方法
        public void beat() {
            System.out.println("qqqq");
            System.out.println("33333");
        }
    }

    // 外部类的成员变量
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // 外部类的成员方法
    public void ddd() {
        System.out.println("这是外部类的方法");
        System.out.println("rrrrrr");
        new demo().beat();
    }
}