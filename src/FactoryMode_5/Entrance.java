package FactoryMode_5;

public class Entrance {
    public static void  main(String[] args){
        AvatarFactory factory1 = new HumanFactory();
        Avatar player1 = factory1.CreateAvatar();
        player1.attack();

        AvatarFactory factory2 = new WerewolfFactory();
        Avatar player2 = factory2.CreateAvatar();
        player2.attack();
    }
}
