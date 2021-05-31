package JAVALambda表达式;

import java.util.ArrayList;

/*
 Lambda表达式：是可推导，可省略
 凡是根据上下文推导出来的内容，可以省略
 可以省略的内容：
    1.(参数列表):括号中参数列表的数据类型，可以省略不写
    2.(参数列表):括号中的参数如果只有一个，那么类型和()都可以省略
    3.{重写接口方法的代码}:如果{}中的代码只有一行。无论是否有返回值，都可以省略({},return,分号)
        注意事项：
            {},return,分号必须一起省略
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        // jdk1.7之前，创建集合对象集合两边得泛型都需要写
        ArrayList<String> list= new ArrayList<>();



    }
}
