package JAVAObject类;


import java.util.Objects;

/*
Objects类的equals方法，对两个对象进行比较，可以防止空指针异常
源码;
    public static boolean equals(Object a, Object b){
        return (a == b) || (a != null && a.equals(b);
    }
 */
public class DemoObjects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "ABC";
        boolean s = Objects.equals(s1, s2);
        System.out.println(s);

    }
}
