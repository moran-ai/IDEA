package JAVAif结构;

public class Demo05IfElsePractise{
    public static void main(String[] args){
        int source = 99;
        if (source < 0 || source > 100){
            System.out.println("成绩错误!");
        } else if (source >= 90 && source <= 100) {
            System.out.println("成绩优秀!");
        } else if (source >= 80 && source < 90) {
            System.out.println("成绩好!");
        } else if (source >= 70 && source < 80) {
            System.out.println("成绩良好!");
        } else if (source >= 60 && source < 70) {
            System.out.println("成绩及格!");
        } else {
            System.out.println("成绩不及格!");
        }
    }
}

