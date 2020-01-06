package StrategyMode;

/**
 * @Author: Loki
 * @Date: 2020/1/6 16:26
 * @Project: JavaLearing
 * @Description:
 */
public class Spell implements Combat{
    @Override
    public void fight(){
        System.out.println("使用法术攻击");
    }
}
