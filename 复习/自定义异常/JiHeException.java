package 复习.自定义异常;

public class JiHeException extends Exception {
    // 有参数构造方法
    public JiHeException(){
        super();
    }

    public JiHeException(String message){
        // 无参数构造方法
        super(message);
    }
}
