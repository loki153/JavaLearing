package FactoryPattern_5;

public class Avatar {
    String name;
    int level;
    double health;
    double mana;

    public void move(){
        System.out.println("行动");
    }

    public void attack(){
        System.out.println("攻击");
    }

    public void recover(){
        System.out.println("恢复");

    }
}
