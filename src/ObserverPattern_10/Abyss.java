package ObserverPattern_10;

import java.util.ArrayList;

public class Abyss {

    private ArrayList<Cinder>  cinders = new ArrayList<Cinder>();

    public void attach(Cinder cinder){
        cinders.add(cinder);
    }

    public void detach(Cinder cinder){
        cinders.remove(cinder);
    }

    public void Notify(){

        for(Cinder c : cinders){
            c.react();
        }
    }
}
