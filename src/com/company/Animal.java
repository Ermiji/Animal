package com.company;

public class Animal {
    private int leg;
    private int horn;

    public Animal(){

    }

    public Animal(int leg, int horn){
        this.leg = leg;
        this.horn = horn;
    }

    public int getLeg() {

        return leg;
    }

    public void setLeg(int leg) {

        this.leg = leg;
    }

    public int getHorn() {

        return horn;
    }

    public void setHorn(int horn)
    {
        this.horn = horn;
    }
}
