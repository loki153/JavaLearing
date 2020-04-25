package FacadePattern_8;

public class Elementalist {
    Earth earth;
    Fire fire;
    Water water;
    Wind wind;

    public Elementalist(){
        earth = new Earth();
        fire = new Fire();
        water = new Water();
        wind  = new Wind();
    }

    public void Blizzard(){
        water.powerOfWater();
        wind.powerOfWind();
        System.out.println("魔法：暴风雪");
    }

    public void meteor(){
        fire.powerOfFire();
        earth.powerOfEarth();
        System.out.println("魔法：陨石术");
    }

}
