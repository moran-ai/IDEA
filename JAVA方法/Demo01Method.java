package JAVA方法;

/*
方法的定义格式：
    public static void 方法名称(){
        方法体
    }
方法调用格式:
    方法名称();

注意事项:
    1.方法定义的先后顺序无所谓
    2.方法定义必须是挨着的，不能在一个方法的内部定义另一个方法
    3.方法定义之后，自己不会执行；如果希望执行，一定要进行方法的调用
 */

// 打印一个矩形
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
        System.out.println("================================");
        Sanjao();
    }

    // 画矩形
    public static void printMethod(){
        for (int j = 0; j < 5; j++) {  // 保证有5行
            for (int i = 1; i < 20; i++) {   // 每行是20个
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // 画三角形
    public static void Sanjao(){
        for (int i = 1; i <= 10; i++){  // i是行数
            for (int j = 1; j>=1 && j <= i; j++){  // j是列数
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
