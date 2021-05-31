package JAVA泛型;

/*
含有泛型的接口，第一种使用方式：定义接口的实现，实现接口，指定接口的泛型
    public interface Iterator<E>{
    E next();
    }

    Scanner类实现了Iterator接口，并指定泛型的接口为字符串,重写next()方法，泛型默认是字符串
    public final class Scanner implements Iterator<String>{
           public String next() {}
    }

 */
public class GenericInterfaceImpl implements GenericInterface<String>{
    @Override
    public void method01(String s){
        System.out.println(s);
    }
}
