package DecorationPattern_3;

public class ThirdSkill extends Skills {
    private String skillName;
    public ThirdSkill(Character character, String skillName){
        super(character);
        this.skillName = skillName;
    }

    @Override
    public void learnSkills() {
        super.learnSkills();
        System.out.println("学习了终极技能 " + skillName);

    }
}
