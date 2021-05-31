package JAVA泛型;

/*
定义一个含有泛型的类，模拟ArrayList集合
泛型是一个未知的数据类型，当不确定使用什么数据类型时，可以使用泛型
泛型可以接收任意数据类型的参数，可以使用Integer,String,Student...
创建对象时，确定泛型的数据类型

 */
public class GenericClass<E> {

    private E name;

    public void setName(E name){
        this.name = name;
    }

    public E getName(){
        return name;
    }
}
