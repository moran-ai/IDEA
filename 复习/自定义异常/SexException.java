package 复习.自定义异常;

public class SexException extends Exception{
    public SexException(){
        super();
    }

    public SexException(String message){
        super(message);
    }
}
