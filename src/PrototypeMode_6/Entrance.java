package PrototypeMode_6;

public class Entrance {

    public static void main(String[] args) throws CloneNotSupportedException {
        Warrior war1 = new Warrior("a");
        war1.setAge(15);
        war1.setGender("M");
        war1.setExp("13","14");

        Warrior war2 = (Warrior) war1.clone();

        Warrior war3 = war1.copy();

        war1.display();
        System.out.println("##########");
        war2.display();
        System.out.println("##########");
        war3.display();
        System.out.println("##########");

        war2.setAge(16);
        war3.setAge(20);

        war1.display();
        System.out.println("##########");
        war2.display();
        System.out.println("##########");
        war3.display();
        System.out.println("##########");

    }
}
