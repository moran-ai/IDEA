package JAVA内部类.概念与分类.成员内部类的定义;


/*
成员内部类的定义格式：
    修饰符 class 外部类名称{
        修饰符 class 内部类名称{

        }
    }
注意：内用外，随意访问;外用内，需要借助内部类对象

使用成员内部类，有两种使用方式
1.间接使用：在外部类的方法中，使用内部类，然后main方法调用外部类的方法
2.直接使用:
    格式：外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */
public class Body {  // 外部类
    public class Heart{ // 成员内部类
        // 内部类的方法
        public void beat(){
            System.out.println("心脏跳动");
            System.out.println("我叫：" + name);
        }
    }

    // 外部类成员变量
    private String name;

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
