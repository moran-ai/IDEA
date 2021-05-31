package 复习.类作为成员变量;

import JAVA内部类.概念与分类.类作为成员变量.Weapon;

public class recall_Main {
    public static void main(String[] args) {
        // 创建一个英雄对象
        recall_Hero recall_hero = new recall_Hero();
        recall_hero.setName("刀锋");
        recall_hero.setAge(23);

        // 创建一个武器对象
        Weapon weapon = new Weapon();

        // 设置武器
        weapon.setCode("王者之怒");

        // 创建人物名对象
        recall_people recall_people = new recall_people();
        // 设置人物名
        recall_people.setName("灵狐");

        // 配置武器
        recall_hero.setWeapon(weapon);
        recall_hero.setRecall_people(recall_people);
        recall_hero.attack();
    }
}
