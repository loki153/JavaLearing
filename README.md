# JavaLearing
# 简单工厂模式
**对于具体操作大同小异的场景，结合一个抽象类，使用工厂类对具体的场景进行判断，通过工厂类决定该实例化哪一种实现类，从而返回的得到的实现类就会执行符合对应逻辑的操作；**
**用一个单独的类来决定具体去实例化哪一个类**
编写一个计算器，对于不同的操作可以对应不同的类，具体的实现逻辑就可以进行封装
```
Operation oper;
oper = OperationFactory.createOperate("加，减，乘，除，求对数等计算）;
oper.getA(1);
oper.getB(2);
result = oper.getResult();
```
简单工厂模式是对面向对象的一种灵活运用，通过简单工厂模式，体现了封装、继承、多态的思想；
# 策略模式
**策略模式定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户——《Head First设计模式》**
先写一个策略接口：
```
public interface WeaponBehavior {
    public void useWeapon();}
```
具体策略接口的实现，分别定义两个策略接口，代表不同的场景
```
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用匕首打斗");
    }}
```
```
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("使用弓箭打斗");
    }}
```
再将具体的策略类通过**组合**的方式放到人物类中：(**多用组合，少用继承是一个重要的设计原则**)
```
public abstract class People {
    WeaponBehavior weaponBehavior;
    public void fight(){
        weaponBehavior.useWeapon();
    }
    public void setWeaponBehavior(WeaponBehavior wb){
        weaponBehavior = wb;
    }}
```
最后选择性执行策略：
```
public class Test {
    public static void main(String[] args){
        People king1 = new King();
        //国王1想使用匕首
        king1.setWeaponBehavior(new KnifeBehavior());
        king1.fight();
        //国王1想换成弓箭
        king1.setWeaponBehavior(new BowAndArrowBehavior());
        king1.fight();

        People knight1 = new Knight();
        //骑士1使用弓箭
        knight1.setWeaponBehavior(new BowAndArrowBehavior());
        knight1.fight();
    }}
```
**这种设计模式是对行为、算法的包装，把同一个抽象方法指派给不同的子类对象实现。**
**工厂模式更像是对对象的管理，而策略模式是对行为的管理。**
# 单一职责模式
# 开放封闭原则模式
# 依赖倒转模式
# 装饰模式
# 代理模式
# 工厂方法模式
# 原型模式 
# 模板方法模式
# 迪米特法则
# 外观模式
# 建造者模式
# 观察者模式
# 抽象工厂模式
# 状态模式
# 适配器模式
# 备忘录模式
# 组合模式
# 迭代器模式
# 单例模式
# 桥接模式 
# 命令模式
# 职责链模式
# 中介者模式
# 享元模式
# 解释器模式
# 访问者模式
