package ObserverPattern_10;

public class Aldrich  extends  Cinder{
    private String name;
    private String FireState;
    private Fire fire;


    public Aldrich (Fire fire,String name ){
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
        System.out.println(this.name + "：预见到深海时代的来临，开始了吞噬神明的道路");
    }


}
