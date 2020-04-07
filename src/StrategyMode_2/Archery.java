package StrategyMode_2;

/**
 * @Author: Loki
 * @Date: 2020/1/6 16:29
 * @Project: JavaLearing
 * @Description:
 */
public class Archery implements Combat{
    @Override
    public void fight() {
        System.out.println("使用箭术攻击");
    }
}
