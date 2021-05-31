package JAVA异常.自定义异常;

/*
    自定义异常类：
        java提供的异常类，不够使用，需要自定义一些异常类
    格式：
        public class xxxException extends Exception | RuntimeException{
            添加一个空参数的构造方法
            添加一个带异常信息的构造方法
        }
    注意：
        1.自定义异常类一般都是以Exception结尾
        2.自定义异常类必须继承Exception类或者RuntimeException类
            继承Exception:自定义的异常类就是编译期异常，如果方法内部抛出了编译期异常，就必须处理，throws或者try-catch
            继承RuntimeException:自定义的异常是运行期异常，如果方法内部抛出了运行期异常，可以不处理，交给JAM处理
 */

public class RegisterException extends Exception{
    // 空参数构造方法
    public RegisterException(){
        super();  // 调用父类无异常参数的构造方法
    }

    // 添加一个带异常信息的构造方法
    /*
    查看源码，所有的异常类都会有一个带异常参数的构造方法，
    方法内部会调用父类异常信息的构造方法，让父类处理异常信息
     */
    public RegisterException(String message){
        super(message);  // 调用父类有异常参数的构造方法
    }
}
