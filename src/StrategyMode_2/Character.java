package StrategyMode_2;

/**
 * @Author: Loki
 * @Date: 2020/1/6 14:55
 * @Project: JavaLearing
 * @Description:
 */
public abstract class Character {
    Display display;
    Combat combat;


    public void setDisplay(Display display) {
        this.display = display;
    }

    public void setCombat(Combat combat) {
        this.combat = combat;
    }

    public void show(){
        display.show();
    }
    public void fight(){
        combat.fight();
    }
}
