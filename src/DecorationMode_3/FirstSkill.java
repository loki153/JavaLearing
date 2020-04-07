package DecorationMode_3;

public class FirstSkill extends Skills {
    private String skillName;

    public FirstSkill(Character character, String skillName){
        super(character);
        this.skillName  = skillName;
    }

    @Override
    public void learnSkills() {

        super.learnSkills();
        System.out.println("学习了初级技能 " + skillName);
    }
}
