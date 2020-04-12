package PrototypeMode_6;

import javax.sound.midi.SysexMessage;
import java.awt.*;

public class Warrior implements Cloneable{
    private String name;
    private String gender;
    private int age;

    private Experience exp;

    public Warrior(String name) {
        this.name = name;
        exp =  new Experience();
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public void setExp(String startDate,String endDate){
        exp.setStartDate(startDate);
        exp.setEndDate(endDate);
   }

   public void display(){
       System.out.println("名称：" + name);
       System.out.println("年龄："  + age);
       System.out.println("性别：" + gender);
   }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Warrior copy(){
        Warrior warrior = new Warrior(this.name);
        warrior.age = this.age;
        warrior.gender = this.gender;

        return warrior;
    }
}
