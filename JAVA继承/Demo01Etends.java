package JAVA继承;

/*
在继承的关系中，子类可以看作是一个父类，即子类可以当作父类看待
例如：
    父类是员工，子类是讲师，那么讲师可以看作是“一个员工”
继承格式：
    定义父类的格式：
        public class 父类名称{

        }
    定义子类的格式：
        public class 子类名称 extends 父类名称{

        }
 */
public class Demo01Etends {
    public static void main(String[] args) {
        // 创建一个子类对象
        Teacher theaher = new Teacher();

        // 子类Teacher中虽然没有写内容，但是会继承来自父类Employee中的内容
        theaher.method();

    }
}
