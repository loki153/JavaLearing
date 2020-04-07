package StrategyMode_2;

/**
 * @Author: Loki
 * @Date: 2020/1/6 16:27
 * @Project: JavaLearing
 * @Description:
 */
public class Swordart implements Combat {
    @Override
    public void fight() {
        System.out.println("使用剑术攻击");
    }
}
