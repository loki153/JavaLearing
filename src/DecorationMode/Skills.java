package DecorationMode;

public class Skills implements Character {
    private Character character;

    public Skills(Character character){
        this.character = character;
    }

    @Override
    public void learnSkills() {
        if( character != null){
            character.learnSkills();
        }
    }
}
