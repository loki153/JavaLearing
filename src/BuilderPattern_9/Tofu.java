package BuilderPattern_9;

import java.util.ArrayList;

public class Tofu {
    ArrayList<String>  parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for(String a  : this.parts){
                System.out.print(a);
        }
    }
}
