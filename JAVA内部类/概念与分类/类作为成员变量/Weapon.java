package JAVA内部类.概念与分类.类作为成员变量;


public class Weapon {
    private String code;  // 武器代代号

    public Weapon(){

    }

    public Weapon(String code){
        this.code = code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }

}
