package ObserverPattern_10;

public class Undead extends  Cinder{
    private String name;
    private String FireState;
    private Fire fire;


    public Undead (Fire fire,String name ){
        this.fire = fire;
        this.name = name;
    }

    public Fire getFire() {
        return fire;
    }

    public void setFire(Fire fire) {
        this.fire = fire;
    }

    @Override
    public void react() {
        System.out.println(this.name + "：走上了传火的道路");
    }
}
