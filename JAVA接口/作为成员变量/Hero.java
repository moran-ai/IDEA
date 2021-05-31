package JAVA接口.作为成员变量;



public class Hero {
    private String name;
    private Skill skill;

    public Hero(){

    }

    public void attack(){
        System.out.println("我叫" + name + ",开始释放技能");
        skill.skill();
        System.out.println("技能释放完毕.");
    }

    public Hero(String name, Skill skill){
        this.name = name;
        this.skill = skill;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSkill(Skill skill){
        this.skill = skill;
    }

    public Skill getSkill(){
        return skill;
    }
}
