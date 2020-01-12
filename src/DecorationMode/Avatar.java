package DecorationMode;

public class Avatar implements Character {
    private String name;

    public Avatar(String name){
        this.name = name;
    }
    @Override
    public void learnSkills() {
        System.out.println(name  + "学会了以下技能");
    }
}
