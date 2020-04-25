package ObserverPattern_10;

public class Entrance {

    public static  void main(String[] args){

        Fire fire = new Fire();


        fire.attach(new Aldrich(fire,"阿尔德里奇"));
        fire.attach(new Undead(fire,"无火的余灰"));

        fire.setMessage("初火渐熄，位不见王影……");
        fire.Notify();


    }




}
