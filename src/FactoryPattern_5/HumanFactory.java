package FactoryPattern_5;

public class HumanFactory implements AvatarFactory {


    @Override
    public Avatar CreateAvatar() {
        return new Human();
    }
}
