package JAVALambda表达式;

/*
需求：
    给定一个厨子接口cook,内含唯一的抽象方法makefood(),无参数，无返回值
    使用lambda的标准格式调用makefood()方法，打印出”吃饭“
 */
public class Demo01Cook {
    public static void main(String[] args) {
        // 调用invokecook方法，参数是cook,传递cook接口的匿名内部类对象
        invokecook(new Cook(){
            @Override
            public void makefood() {
                System.out.println("吃饭了");
            }
        });

        // 使用lambda简化代码
        invokecook(()->{
            System.out.println("吃饭了");
        });
    }

    // 定义一个方法，参数传递cook接口,方法调用cook接口里面的方法makefood()
    public static void invokecook(Cook cook){
        cook.makefood();
    }
}
