package 复习;

public class Pep {
    public static void main(String[] args){
        People p = new People();
        p.name = "小明";
        p.age = 18;
        p.weight = "120公斤";
        p.height = 180;
        p.sex = "男";
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.weight);
        System.out.println(p.height);
        System.out.println(p.sex);
        System.out.println("============");
        p.Name("赵韩樱子");
        p.Age(27);
        p.Weight("80公斤");
        p.Height(175);
        p.Sex("女");
    }

}
