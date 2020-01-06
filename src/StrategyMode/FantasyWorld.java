package StrategyMode;

/**
 * @Author: Loki
 * @Date: 2020/1/6 16:33
 * @Project: JavaLearing
 * @Description:
 */
public class FantasyWorld {
    public static void main(String[] args){
        Character c1 = new Grounder();
        c1.setDisplay(new Human());
        c1.setCombat(new Swordart());
        c1.show();
        c1.fight();

        Character c2 = new Forest();
        c2.setDisplay(new Elf());
        c2.setCombat(new Archery());
        c2.show();
        c2.fight();

        Character c3 = new Swamp();
        c3.setDisplay(new Undead());
        c3.setCombat(new Spell());
        c3.show();
        c3.fight();
    }
}
