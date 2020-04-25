package FactoryPattern_5;

public class Werewolf extends  Avatar{

    Werewolf(){
        super();
        System.out.println("种族：狼人");
    }


    @Override
    public void attack() {
        System.out.println("使用利爪攻击");
    }
}
