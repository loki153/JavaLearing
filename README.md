# JavaLearing
# 1.简单工厂模式
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
# 2.策略模式
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
# 3.单一职责原则
**单一职责原则(SRP):就一个类而言，应该仅有一个引起它变化的原因**
# 4.开放-封闭原则
**开放封闭原则（ASD）：软件实体应该可以扩展，但是不可修改，对于扩展是开放的，对于更改是封闭的**

* 无论模块是多么的封闭，都会存在一些无法对之封闭的变化。既然不可能完全封闭，设计人员必须对于他设计的模块应该对哪种变化封闭做出选择，他必须先猜测出最有可能发生的变化种类，然后构造抽象来隔离那些变化（ASD）
* 在编写代码时，假设变化不会发生。当变化发生时，我们就创建抽象来隔离以后发生的同类变化（ASD）
* 开放-封闭原则是面向对象设计的核心所在，遵循这个原则可以带来面向对象技术所生成的巨大好处，也就是可维护、可扩展、可复用、灵活性好。开发人员应该仅对程序中呈现出频繁变化的那些部分做出抽象，然而，**对于应用程序中每个部分都可以进行抽象同样部署以个好主意**。拒绝不成熟的抽象和抽象本身一样重要（ASD）
# 5.依赖倒转原则
* 高层模块不应该依赖低层模块，两个应该依赖抽象
****
# 6.装饰模式
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

# 7.代理模式
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
# 8.工厂方法模式
在简单工厂方法中，使用case方法判断实例化哪个具体类，当出现新的需求时，需要修改的地方较多，且违背“开放封闭”原则，因此，需要用到工厂方法模式。
* 工厂方法模式： 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类。
* 工厂方法模式与简单工厂方法模式的区别：**工厂方法把简单工厂的内部逻辑判断转移到了客户端代码中进行。**
```
Ifactory factory = new ConcreteFactory();//在客户端处判断需要用到哪类工厂
ConcreteProduct  product = factory.Create();//在这里就已经是通用的部分了
product.fun1();
product.fun2();
product.fun3();
```
# 9.原型模式 
* 原型模式：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
* 深拷贝与浅拷贝：浅拷贝通过复制对象的引用，深拷贝把引用对象的变量指向复制过的新对象，而不是原有的被引用的对象。
* **复制结构不复制数据，使用浅复制，复制结构与数据，使用深复制**
```
@Overrideprotected Object clone() throws 
CloneNotSupportedException {    return super.clone();}//实现克隆方法

public Object clone(){
    Object obj = new Object(this.name);
    obj.age = this.age;
    obj.gender = this.gender;
    return obj;
    }//最终返回一个深复制的对象
```
# 10.模板方法模式
**当子类中出现大量的重复代码，应当考虑将该部分的内容上升到父类去。**
* 适用场景：当我们要完成在某一细节层次一致的一个过程或一系列步骤，但其个别步骤在更详细层次上的实现可能不同时，我们通常考虑用模板方法模式来处理。
* 模板方法模式：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
模板方法典型模式：
```
abstract Class Template{
    public abstract void fun1();
    pulic abstract void fun2();//这些方法留给子类去实现
   
   public void Templatefun(){
        fun1();
        fun2();//在这里规定了执行的逻辑
        }
```
# 11.迪米特法则
* 迪米特法则：如果两个类不必彼此通信，那么这两个类就不应当彼此发生直接的相互作用。如果其中一个类需要调用一个类的某一个方法的话，可以通过第三者转发这个调用。
* **迪米特法则强调，在类的结构设计上，每一个类都应当尽量降低成员的访问权限，强调类直接的松耦合。**
# 12.外观模式
* 外观模式：为子系统中的一组接口定义一个一致的界面，此模式定义了一个高层接口，这个接口使得子系统更加容易使用。
* **在一个系统设计之初，就应当在数据访问层与业务逻辑层、业务逻辑层与表示层之间建立外观Facade，为复杂的子系统建立一个简单的接口，降低耦合度。**
```
//外观类中的方法，需要先了解所有的子系统的方法，进行组合，提供给外界使用
public void methodA()
    {
    one.methodOne();
    two.methodTwo();//子系统中的某个方法
    }
```
# 13.建造者模式
* 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
* 适用场景：当创建复杂对象的算法应该独立于该对象的组成部分以及他们的装配方式时适用的模式。
* 建造者模式需要：
    * 产品类：通常需要多个部件
    * 抽象建造者类：确定产品由那些部件组成，并声明一个得到产品的方法
    * 具体建造者类：has 产品，具体定义产品的各个部件的构造方法
    * 指挥者类：使用构造者作为其构造函数的参数，指挥建造过程
 ```
 Director direcotor = new Director();
 Builder b1 = new ConcreteBuilder1();
 Builder b2 = new ConcreteBuilder2();
 
 director.constuct(b1);
 Product p1 = b1.getResult();//通过b1进行建造
 p1.show()
 
 Product p2 = b2.getResult();//通过b2进行建造
 p2.show();
```

 
# 14.观察者模式

* 观察者模式:定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
* 观察者模式：
    1. 需要抽象通知者、抽象观察者；
    2. 抽象通知者将抽象观察者加到自己维护的一个列表中；
    3.每当抽象观察者发现状态发生变化时，调用自身notify方法，则遍历列表中的对象，并调用其update（）方法

```
ConcreteSubject s = new ConcreteSubject();
s.attach(new ConcreteOberserver(s,"X");//观察者has通知者，通知者也需要attach观察者
s.attach(new ConcreteOberserver(s,"Y");
s.attach(new ConcreteOberserver(s,"Z");

s.subjectState = "changed";//观察对象发生变化
s.Notify();//此处每一个观察者就会执行其update方法
```
**观察者模式所做的工作是在接触耦合，让耦合的双方都依赖于抽象，而不是依赖于具体，从而使得各自的变化都不会影响另一边的变化**
    

# 15.抽象工厂模式
* 抽象工厂：提供一个创建一系列相关或者相互依赖对象的接口，而无需指定它们具体的类。
``` 
User user = new User();//用户表对象
Department dept = new Department();//部门表对象

//IFactory factory = new MySQLFactory();
IFactory factory = new OralcleFactory();//在这里选择实例化哪一类工厂

Iuser iu = factory.CreateUser();
...

IDepartment id = factory.CreateDepartment();//到这个环节已经与具体的类解除了依赖

```
* 简单工厂+ 反射： 抽象工厂中选取哪一个工厂类的判断，可以参考简单工厂的实现方法（switch），进一步的，使用如下方法替代switch方法：
```
Iuser result = (IUser)Assembly.Load("抽象工厂模式").CreateInstance("抽象工厂模式.MySQLUser");
```

* 配置文件 + 反射：通过添加外部配置文件的方法，替代简单工厂中的具体字符串，减少了修改程序的必要
```
private static readonly String db = ConfigurationManager.AppSettings["DB]

<appSettings>
    <add key ="DB" value = "MySQL"/>
</appSettings>
```
# 16.状态模式
# 17.适配器模式
# 18.备忘录模式
# 19.组合模式
# 20.迭代器模式
# 21.单例模式
# 22.桥接模式 
# 23.命令模式
# 24.职责链模式
# 25.中介者模式
# 26.享元模式
# 27.解释器模式
# 28.访问者模式
