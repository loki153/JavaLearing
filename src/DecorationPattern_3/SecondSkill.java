package DecorationPattern_3;

public class SecondSkill extends Skills {

    private String skillName;

    public SecondSkill(Character character , String skillName){
        super(character);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {

        super.learnSkills();
        System.out.println("学习了进阶技能 "  + skillName);
    }
}
