package FactoryPattern_5;

public class WerewolfFactory implements AvatarFactory {
    @Override
    public Avatar CreateAvatar() {
        return new Werewolf();
    }
}
