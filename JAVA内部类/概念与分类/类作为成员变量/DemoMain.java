package JAVA内部类.概念与分类.类作为成员变量;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero = new Hero();

        hero.setName("盖伦");
        hero.setAge(20);

        // 创建一个武器对象
        Weapon weapon = new Weapon();
        weapon.setCode("马来剑");

        // 为英雄配置武器
        hero.setWeapon(weapon);
        hero.attack();
    }
}
