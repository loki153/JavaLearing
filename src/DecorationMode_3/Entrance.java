package DecorationMode_3;

public class Entrance {
    public static void main(String[] args){
        System.out.println("装饰模式实例");
        Character player = new Avatar("loki");
        FirstSkill p1 = new FirstSkill(player,"召唤小恶魔");
        SecondSkill p2 = new SecondSkill(p1,"召唤地狱犬");
        ThirdSkill p3 = new ThirdSkill(p2,"召唤虚空领主");


        p2.learnSkills();
//        p3.learnSkills();
    }
}
