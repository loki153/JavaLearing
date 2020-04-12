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
# 单一职责原则
**单一职责原则(SRP):就一个类而言，应该仅有一个引起它变化的原因**
# 开放-封闭原则
**开放封闭原则（ASD）：软件实体应该可以扩展，但是不可修改，对于扩展是开放的，对于更改是封闭的**

* 无论模块是多么的封闭，都会存在一些无法对之封闭的变化。既然不可能完全封闭，设计人员必须对于他设计的模块应该对哪种变化封闭做出选择，他必须先猜测出最有可能发生的变化种类，然后构造抽象来隔离那些变化（ASD）
* 在编写代码时，假设变化不会发生。当变化发生时，我们就创建抽象来隔离以后发生的同类变化（ASD）
* 开放-封闭原则是面向对象设计的核心所在，遵循这个原则可以带来面向对象技术所生成的巨大好处，也就是可维护、可扩展、可复用、灵活性好。开发人员应该仅对程序中呈现出频繁变化的那些部分做出抽象，然而，**对于应用程序中每个部分都可以进行抽象同样部署以个好主意**。拒绝不成熟的抽象和抽象本身一样重要（ASD）
# 依赖倒转原则
* 高层模块不应该依赖低层模块，两个应该依赖抽象
****
# 装饰模式
在策略模式下，通过预先定定义的算法族，为对象的方法增加了策略上的灵活性，但是，对于执行上的强制性要求则更强，如果某些执行步骤不是必须的话，可以考虑使用装饰模式。
* 装饰模式是为已有功能动态地添加更多功能的方式，当需要新的功能时，向旧的类中添加新的代码，这些新代码通常**修饰了**原有类的核心职责或主要行为，可以在主类中添加新的**字段、方法、逻辑**，从而增加主要的复杂度。
* 从结果上来看，我们需要一个基础接口，被装饰类与装饰类都实现该接口，然后装饰类实例通过被装饰类的实例来进行装配并构造，从而实现装饰；
* 被装饰类和装饰类都 实现基础接口，装饰类都继承装饰父类，并覆盖父类的对应方法，以达到**实现逐层的装饰**
```
BaseClass bc = new Decoratee dt（）;
Decorator1  dc1 = new Decorator1(dt);
Decorator2  dc2 = new Decorator2(dc1);
Decorator3 dc3 = new Decorator3(dc2);
...

```

# 代理模式
* 代理模式：为其他对象提供一种代理，以控制对这个对象的访问。代理对象在客户端和目标对象之间起到中介的作用。
* 优势
    * 1.代理模式将代理对象与真实对象被调用的目标对象分离；
    * 2.一定程度上降低了系统的耦合度，扩展性好；
    * 3.保护目标对象；
    * 4.增强目标对象
* 劣势
    * 1.代理模式会造成系统设计中类的数目增加；
    * 2.在客户端和目标对象增加一个代理对象，会造成请求处理速度变慢；
    * 3.增加了系统的复杂度；
* 代理模式，首先需要为客户和代理提供一个共用的接口，然后将客户的实例对象组合到代理的实例中，从而使得代理既可以使用自身的方法实现客户无法实现的逻辑，也可以为客户的相关方法（也就是双方事先约定的方法）提供代理。
```
abstract class subject
{
    public abstract void Request();
}
```
```
class RealSubject: implements Subject
{
    public override void Request()
    {
     ...
     }
} 
```
```
class Proxy implements Subject
{
    RealSubject realSubject;
    public override void Request()
    {
    ...
    realSubject.request();
    ...
    }
}
```
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
