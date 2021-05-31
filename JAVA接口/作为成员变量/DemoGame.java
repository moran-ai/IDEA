package JAVA接口.作为成员变量;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾琳");

        // 设置技能
        Skill skill = new Skill() {
            @Override
            public void skill() {
                System.out.println("biubiubiu");
            }
        };

        hero.setSkill(skill);
        hero.attack();
    }
}
