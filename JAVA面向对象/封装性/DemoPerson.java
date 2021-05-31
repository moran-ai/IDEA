package JAVA面向对象.封装性;


public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        System.out.println("===============");
        person.name = "赵丽颖";

        //person.age = 22; //直接访问private错误
        // 间接访问private
        person.setAge(20);

        person.show();
    }
}
