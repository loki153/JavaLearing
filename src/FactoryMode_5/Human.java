package FactoryMode_5;

public class Human extends Avatar {
    Human(){
        super();
        System.out.println("种族：人类");
    }

    @Override
    public void attack() {
        System.out.println("使用武器攻击");
    }
}
